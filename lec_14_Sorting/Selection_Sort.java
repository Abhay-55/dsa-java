package lec_14_Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,13,-4,5,7};
		selectionSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void selectionSort(int[] arr) {

		for(int i = 0;i<arr.length-1;i++) {
			int min_Index = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j ]<arr[min_Index]) {
					min_Index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_Index];
			arr[min_Index] = temp;
		}
		
	}

}
