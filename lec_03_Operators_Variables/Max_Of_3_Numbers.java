package lec_03_Operators_Variables;

import java.util.Scanner;

public class Max_Of_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println("a is the greatest");
		} else if (b >= a && b >= c) {
			System.out.println("b is the greatest");
		} else {
			System.out.println("c is the greatest");
		}

	}

}
