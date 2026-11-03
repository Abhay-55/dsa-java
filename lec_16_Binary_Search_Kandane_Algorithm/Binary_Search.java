package lec_16_Binary_Search_Kandane_Algorithm;

public class Binary_Search {

	public static void main(String[] args) {
		// BINARY SEARCH only work on Sorted Array
		int[] arr = { 2, 5, 8, 9, 12, 15, 16, 17, 20, 25 };
		int item = 17;
		System.out.println("Index of Item: " + binarySearch(arr, item));

	}

	public static int binarySearch(int[] arr, int item) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
