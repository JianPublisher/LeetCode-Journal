
import java.util.Arrays;

//copy to compiler to run it
class Main {
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,6,8,10,9};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}

		int mid = left + (right - left) / 2;
		//need to swap mid with end, so create a swap method
		swap(arr, mid, right);

		//Now we need to do partition, and also after partition it should return the index of the pivot, since pivot might move location if swaps happened during partition
		int pivotIndex = partition(arr, left, right);

		quickSort(arr, left, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, right);
	}

	private static int partition(int[] arr, int left, int right) {
		//whenever we pass the arr, int and right into this method, the arr[right] always has the pivot value because we swap before doign partition
		int pivotValue = arr[right];
		int i = left;

		//j is the explorer, see which number is smaller than the pivot, then move it to the left which is the i value
		for (int j = left; j < right; j++) {
			if (arr[j] < pivotValue) {
				swap(arr, i, j);
				i++;
			}
		}

		//once this is done, we swap back the pivotValue back to its correct position
		swap(arr, i, right);
		return i;
	}


	private static void swap (int[] arr, int a, int b) {
		if (a == b) {
			return;
		}

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}