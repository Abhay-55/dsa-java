package lec_14_Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,13,-4,5,7};
		insertionSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}
	
	public static void insertionSort(int[] arr) {
		//Single Element is sorted, we assume it is arr[0]  
		for(int i = 1;i<arr.length;i++) {
			int picked = arr[i];//Element which will be compared
			int j = i-1;
			while(j>=0 && arr[j]>picked) {  // First index will be compared that's why j>=0 at first them value
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = picked;
		}
	}

}
