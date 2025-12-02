public class BinarySearch {
	private static Integer BinarySearch(int[] list, int target) {
		int left = 0;
		int right = list.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (list[mid] == target) {
				return mid;
			}

			if (list[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return null;
	}

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,7,8,9,100};

		System.out.println(BinarySearch(list, 100)); // This should print 9 because the index of 100 is 9
	}
}