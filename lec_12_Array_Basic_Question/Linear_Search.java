package lec_12_Array_Basic_Question;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, -4, 7, 11 };
		int item = 4; 
		System.out.println("Item Index: "+Search(arr,item));

	}

	public static int Search(int[] arr, int item) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == item) {
				return i;
			} 
			i++;
		}
		return -1;
	}

}
