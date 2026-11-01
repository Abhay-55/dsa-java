// https://leetcode.com/problems/trapping-rain-water/description/
package lec_15_Array_Question_Part_1;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(Rain_Water(height));

	}
	
	//This is called PREFIX CONCEPT
	
	public static int Rain_Water(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i =1;i<n;i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int[] right = new int[n];
		right[n-1] = arr[n-1];
		for(int j = n-2;j>=0;j--) {
			right[j] = Math.max(right[j+1], arr[j]);
		}
		
		int sum = 0;
		for(int k = 0;k<n;k++) {
			sum += Math.min(left[k], right[k]) - arr[k];
		}
		
		return sum;
	}

}
