package lec_12_Array_Basic_Question;

public class Max_Value_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,51,7,56};
		System.out.println("Max Value: "+ maxValue(arr));
		System.out.println("Max Value With Comparison:  "+ maxValue_1(arr));
		
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		int i = 1;
		while(i<arr.length) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
	
	//Comparing Array Value with Min value of Integer
	public static int maxValue_1(int[] arr) {
		int max = Integer.MIN_VALUE; // -2^31
		int i = 1;
		while(i<arr.length) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
			max = Math.max(arr[i],max); 
			i++;
		}
		return max;
	}

}
