package lec_22_String;

public class Sub_String {

	public static void main(String[] args) {
		String s = "abcdefghi";
		// Excluded last index(here 3)
		System.out.println(s.substring(0, 3));
		// Character at provide index
		System.out.println(s.charAt(5));
		// Provide String form given index (here included 5)
		System.out.println(s.substring(5));

	}

}
