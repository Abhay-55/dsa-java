package lec_22_String;

public class Equals_Two_String {

	public static void main(String[] args) {
		/*
		 * Here we will write code of in-build equals() method
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Abhay");
		// Both content same so true
		System.out.println(equalsString(str1, str2));

		// Both content same so true
		System.out.println(equalsString(str1, str3));

		// Both content different so false
		System.out.println(equalsString(str1, str4));
	}

	public static boolean equalsString(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
