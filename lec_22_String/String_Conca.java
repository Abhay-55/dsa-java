package lec_22_String;

public class String_Conca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Abhay";
		String str2 = "Maity";
		// concatenation using addition sign
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		// concatenation using concat method
		str1 = str1.concat(" " + str2);
		System.out.println(str1);

	}

}
