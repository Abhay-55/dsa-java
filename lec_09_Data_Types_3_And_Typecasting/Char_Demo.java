package lec_09_Data_Types_3_And_Typecasting;

public class Char_Demo {

	public static void main(String[] args) {
		 char ch = 'a';
		 char ch1 = 'b';
		 char ch2 = '0';
		 System.out.println(ch);
		 System.out.println(ch1);
		 System.out.println(ch2);
		 //Char to Int -> Explicit Typecasting
		 System.out.println((int)(ch));
		 System.out.println((int)(ch1));
		 System.out.println((int)(ch2));
		 //Adding Char
		 System.out.println(ch + ch1);
		 
		 int x = 12;
		 x++;
		 System.out.println(x);
		 ch++; //Implicit Typecasting
		 System.out.println(ch);
		 
		 ch = (char)(ch+1); // Explicit Typecasting -> Char + Int 
		 System.out.println(ch);

	}

}
