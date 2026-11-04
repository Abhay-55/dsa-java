package lec_18_2D_Array;

import java.util.Scanner;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		int [][]  arr = new int[3][4];
		//Address of the array that holds address of other 3 arrays.
		System.out.println(arr);
		//Address of the array for 0th row.
		System.out.println(arr[0]);
		//Address of the array for 1st row.
		System.out.println(arr[1]);
		//Address of the array for 2nd row.
		System.out.println(arr[2]);
		
/*		 Element of Array
		 This will show zero as by default value is zero.		  
*/
		System.out.println(arr[0][1]);
		//Calling method which is taking input in Array
		inputArray(arr);
		//Calling Function that print 2D Array
		display(arr);
	}
	
	public static void inputArray(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		int rowSize = arr.length; // This will provide row length
/*			this is column length, we can use any 
			index within column range other than zero.
*/
		int columnSize = arr[0].length;
		for(int i = 0;i<rowSize;i++) {
			//columnSize is same arr[i].length
			for(int j = 0;j<columnSize;j++){
				arr[i][j] = sc.nextInt();
			}
		} 
	}
	public static void display(int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			//columnSize is same arr[i].length
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 

		
	}

}
