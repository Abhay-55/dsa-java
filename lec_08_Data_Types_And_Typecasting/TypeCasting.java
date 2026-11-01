package lec_08_Data_Types_And_Typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Within byte Range
		int i = 10;
		byte b = 10;
		long l = 11;
		short s = 10;
		// Explicit Typecasting
		b = (byte)(i);
		System.out.println(b);
		//Implicit Typecasting
		l = b;
		System.out.println(l);
		
		//Outside Byte Range  
		int j = 300;
		byte c = 10;
		long k = 10;
		short t = 10;
		// Explicit Typecasting
		c = (byte)(j);
		System.out.println(c);
		
		//Negative Output  
		int h = 428;
		byte d = 10;
		long m = 10;
		short u = 10;
		
		// Explicit Typecasting
		d = (byte)(h);
		System.out.println(d);		
		

	}

}
