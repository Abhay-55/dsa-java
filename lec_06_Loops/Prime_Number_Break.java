package lec_06_Loops;

import java.util.Scanner;

public class Prime_Number_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 2;i<n;i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		if(count == 1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
