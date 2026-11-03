package lec_03_Operators_Variables;

import java.util.Scanner;

public class simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int SI = (p * r * t) / 100;
		System.out.println("Simple Interest: " + SI);

	}

}
