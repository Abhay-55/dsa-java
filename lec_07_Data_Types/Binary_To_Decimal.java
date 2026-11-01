package lec_07_Data_Types;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%10;
			sum += rem*mul;
			mul = mul*2;
			n /=10;
		}
		System.out.println(sum);

	}

}
