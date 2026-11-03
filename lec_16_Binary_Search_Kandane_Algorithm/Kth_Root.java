package lec_16_Binary_Search_Kandane_Algorithm;

public class Kth_Root {

	public static void main(String[] args) {
//		x^k <= n --> Find highest value of x
		int n = 87;
		int k = 3;
		System.out.println(root(n, k));

	}

	public static int root(int n, int k) {
		int low = 1;
		int high = 87;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
