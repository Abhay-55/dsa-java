package lec_22_String;

public class String_Method {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Abhay");
		String str3 = "Hello";
		String str4 = new String("Hey");
		// comparing location of two string not content
		System.out.println(str1 == str2);

		// Both present in string pool with same content so address same
		System.out.println(str1 == str3);

		// Comparing content of two string
		System.out.println(str1.equals(str3));
	}

}
