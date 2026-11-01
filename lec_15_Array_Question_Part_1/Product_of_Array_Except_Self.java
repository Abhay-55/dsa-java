// https://leetcode.com/problems/product-of-array-except-self/description/
package lec_15_Array_Question_Part_1;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,4 };
		int[] ans = productOfArrayExceptSelf(nums);
		for(int i = 0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int [] productOfArrayExceptSelf(int[] arr) {
		int n = arr.length;
		//Left Side Multiplication Calculation
		int [] left = new int[n];
		left[0] = 1;
		for(int i = 1;i<n;i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		//Right Side Multiplication Calculation
		int [] right = new int[n];
		right[n-1] = 1;
		for(int i = n-2;i>=0;i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		//Final Product Right*Left and stroing it in left array
		for(int i = 0;i<n;i++) {
			left[i] = left[i]*right[i];
		}
		
		return left;
	}

}
