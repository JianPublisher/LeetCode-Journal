public SelectionSort () {

	private static List<Integer> selectionSort(List<Integer> arr) {
		List<Integer> sortedList = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				//this swap places, always ensure element at index i is always the smallest
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}