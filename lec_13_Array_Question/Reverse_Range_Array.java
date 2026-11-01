package lec_13_Array_Question;

import java.util.Scanner;

public class Reverse_Range_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int i = sc.nextInt();
		int j = sc.nextInt();
		reverseArrayRange(arr,i,j);
		System.out.print("Array after Reverse: ");
		for(int k = 0;k<arr.length;k++) {

			System.out.print(arr[k]+" ");
		}
	}
	
	public static void reverseArrayRange(int[] arr,int i , int j) {
		//This is TWO POINTER APPROACH
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
