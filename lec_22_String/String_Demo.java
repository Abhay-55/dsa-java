package lec_22_String;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = new String("Hello");
		// Printing content not address
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		// length of String
		System.out.println(str1.length());

	}

}
