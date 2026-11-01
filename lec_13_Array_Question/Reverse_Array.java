package lec_13_Array_Question;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,78,90,528,456};
		reverseArray(arr);
		System.out.print("Array after Reverse: ");
		for(int i = 0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
		}
		 

	}
	
	public static void reverseArray(int[] arr) {
		 int i = 0;
		 //This is TWO POINTER APPROACH
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
