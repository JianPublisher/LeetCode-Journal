public class CountingSort {

	public static void countingSort(int[] arr) {

		//finding min and max
		int min = arr[0];
		int max = arr[0];
		for (int n : arr) {
			min = n < min  ? n : min;
			max = n > max ? n : max; // this is basically max = Math.max(max, n) but its abit slower
		}

		int range = max - min + 1;

		int[] count = new int[range];
		for (int n : arr) {
			count[n - min]++; //if min is 1 then 1 - 1 is 0 so we store 1 in arr[0] makes sense
		}

		//prefix sum
		//this just tells where value should go into the array like
		//for example after prefix we get [2, 5, 6]
		//it means our first value should be inserted from 0 to 2
		//second value from 3 to 6 something like this
		for (int i = 1; i < range - 1; i++) {
			count[i] += count[i - 1];
			//since count used to store occurence, we can get the position with the occurence
			// if its 2 4 3
			//we know first value takes 2 space, second value takes 4
			//so after count[i] += count[i - 1] looks like
		}

		//build output
		int[] output = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {

			int val = arr[i];           // original value
			int index = val - min;      // find its bucket

			int pos = count[index] - 1; // LAST seat for this value (0-based)
			output[pos] = val;          // place the value

			count[index]--;             // next identical value shifts left
			//same as count[index] = count[index] - 1; so we shift the ending position
		}
	}
}
