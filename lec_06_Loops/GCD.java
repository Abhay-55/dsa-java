package lec_06_Loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// GCD/HCF -> Greatest Common Divisor/Height Common Factor
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int divident = sc.nextInt();
//		while(divident % divisor != 0) {
//			int rem = divident % divisor;
//			divident = divisor;
//			divisor = rem;
//		}
		for(;divident%divisor != 0;) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;	
		}
		System.out.println(divisor);

	}

}
