// https://www.spoj.com/problems/AGGRCOW/
package lec_20_Advance_Binary_Search_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Aggrasive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt(); //Number of Stalls 
			int c = sc.nextInt(); //Number of cows
			int[] stall = new int[n];
			for(int i = 0;i<stall.length;i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(minDistance(stall,c));
		}

	}
	public static int minDistance(int[] stall, int c) {
		int low = stall[0];
		int high  = stall[stall.length -1];
		int ans = 0;
		while(low<=high) {
			int mid = (low + high)/2;
			if(isItPossible(stall,c,mid) == true) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static boolean isItPossible(int[] stall, int c,int mid) {
		int pos = stall[0];
		int cowsCount = 1;
		for(int i = 1;i<stall.length;i++) {
			if(stall[i] - pos >= mid) {
				cowsCount++;
				pos = stall[i];
			}
			if(cowsCount == c) {
				return true;
			}
		}
		return false;
	}
	

}
