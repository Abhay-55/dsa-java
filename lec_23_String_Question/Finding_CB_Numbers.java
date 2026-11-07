// https://hack.codingblocks.com/app/contests/2883/165/problem

package lec_23_String_Question;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		String s1 = "81615";
		System.out.println(printSubstring(s1));
	}
	public static int printSubstring(String s) {
		int count = 0;
		boolean [] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i,j);
				// Numeric string to long
				if(isCBNumber(Long.parseLong(s1)) == true && isVisisted(visited,i,j) == true) {
					count++;
					//marking flag true
					for(int k = i;k<j;k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}
	public static boolean isCBNumber(long num) {
		if(num==0 || num == 1) {
			return false;
		}
		int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for(int i = 0;i<arr.length;i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			if(num %arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isVisisted(boolean [] visited,int i , int j) {
		for(;i<j;i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}

}
