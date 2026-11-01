package lec_11_Array_Block;

public class Array_Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		System.out.println(arr[0]+" "+arr[1] );
		//Swap local variable a & b a swap hobe array te hobe na
		swap1(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1] );
		//Array ar adress a change korchi, so array te change hobe
		//THIS IS "CALL BY VALUE" (Not Call By Referrence) 
		swap2(arr,0,1);
		System.out.println(arr[0]+" "+arr[1] );
	}
	
	public static void swap1(int a, int b) {
		int temp = a;
		a = b;
		b = temp; 
	}
	
	public static void swap2(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
