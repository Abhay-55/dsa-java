package lec_20_Advance_Binary_Search_Questions;

import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//number of books
		int m = sc.nextInt();//number of student
		int[] page = new int[n];
		for(int i = 0;i<n;i++) {
			page[i] = sc.nextInt();
		}
		System.out.println(bookAllocation(page,m));

	}
	public static int bookAllocation(int[] arr, int m) {
		int low = 0;
		int high = 0;
		for(int i =0;i<arr.length;i++) {
			high += arr[i];
		}
//		int high = sumOfAllDigits;
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(isItPossible(arr,m,mid)== true) {
				ans = mid;
				high = mid -1;;
			}
			else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	public static boolean isItPossible(int[] arr, int m, int mid) {
		int readPage = 0;
		int student = 1;
		for(int i = 0;i<arr.length;i++) {
			if(readPage + arr[i] <= mid) {
				readPage += arr[i];
			}
			else {
				student++;
				readPage = arr[i];
			}
			if(student > m) {
				return false;
			}
		}
		return true;
	}

}
