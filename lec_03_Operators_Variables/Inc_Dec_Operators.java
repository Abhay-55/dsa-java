package lec_03_Operators_Variables;

public class Inc_Dec_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		//a++; -> a=a+1;
		System.out.println(a++);
		//++a; -> a = a+1l
		System.out.println(a);
		
		System.out.println(++a);
		
		int b = 9;
		System.out.println(b--);
		
		System.out.println(b);
		
		System.out.println(--b);
		
		// Post Increment 
		a = 9;
		b = 8;
		int c = a++ - b++ - b-- + a++;
		System.out.println("Result:"+c);
		
		// Pre Increment
		
		a = 6;
		b = 5;
		c = a++ + ++a - --b + ++b - b--;
		System.out.println(c);
		

	}

}

