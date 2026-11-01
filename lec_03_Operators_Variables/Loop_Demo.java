package lec_03_Operators_Variables;

import java.util.Scanner;

public class Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(i<=n) {
			System.out.println("This is "+i+" Times");
			i++;
		}

	}

}
