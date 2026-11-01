package lec_11_Array_Block;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5]; 
		//Array Location
		System.out.println("array adress: "+arr);
		
		//Printing by default value
		System.out.println("Printing by default value: ");
		for(int i = 0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		//New Line
		System.out.println();
		for(int i = 0;i<5;i++) {
			//Updating value in array
			arr[i]= i + 1;
		}
		
		//Printing provided value
		System.out.println("Printing provided value: ");
		for(int i = 0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
