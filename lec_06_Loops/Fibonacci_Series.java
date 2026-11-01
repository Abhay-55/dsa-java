package lec_06_Loops;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1; i<=n;i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		//This is the nth term & it is zero indexing based series
		System.out.println(a);

	}

}
