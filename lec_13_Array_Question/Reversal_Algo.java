// https://leetcode.com/problems/rotate-array/
package lec_13_Array_Question;

public class Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,78,90,528,456};
		int k = 3;
		rotate(arr,k);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}
	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		reverseArrayRange(arr,0,n-k-1);
		reverseArrayRange(arr,n-k,n-1);
		reverseArrayRange(arr,0,n-1);
		
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
