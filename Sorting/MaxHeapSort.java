public class MaxHeapSort {

	public static void maxHeapSort(int[] arr) {
		int n = arr.length;

		//(n - 2 ) / 2 1 == searches the last parent that has atleast one child
		//This builds m
		for (int i = (n - 2) / 2; i >=0; i++) {
			siftDown(a, i, n);
		}
	}

	/**
	 * SiftDown means taking a parent node and compare with children. If its smaller than child, swap with the largest chidren
	 * Once thats down, we move down again on the swapped branch and do the same thing - recursion
	 *
	 * @param arr array
	 * @param i index of current node ( parent node )
	 * @param n size of the heap we are accessing ( Note as we extract extract max and shrink, n should decrease )
	 */
	private static void siftDown(int[] arr, int i, int n) {
		while (true) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			int largest = i;

			if ((left < n && arr[left] > arr[largest]) || (right < n && arr[right] > arr[largest])) {
				if (arr[right] > arr[left]) {
					largest = right;
				} else {
					largest = left;
				}
			} else {
				break;
			}
			swap(a, i, largest);
			i = largest;
		}
	}

	private static void swap(int[] a, int i, int largest) {
		int temp = a[i];
		a[i] = a[largest];
		a[largest] = temp;
	}
}
