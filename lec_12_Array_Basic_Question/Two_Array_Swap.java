package lec_12_Array_Basic_Question;

public class Two_Array_Swap {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] other = {100,200,300,400,500};
		//Before Swap
		System.out.println(arr[0]+ " "+other[0]);
		//THIS IS "CALL BY REFERRENCE"
		swap(arr,other); 
		//Printing After SWAP
		System.out.println(arr[0]+ " "+other[0]);
	}
	
	public static void swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}
	

}
