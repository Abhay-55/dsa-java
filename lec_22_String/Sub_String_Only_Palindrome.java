// Printing all substring which is palindrome
package lec_22_String;

public class Sub_String_Only_Palindrome {

	public static void main(String[] args) {
		String s = "nitin";
		printSubarray(s);

	}

	public static boolean printSubarray(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (isPalindrome(str)) {
					System.out.println(str);
				}

			}
		}
		return true;
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
