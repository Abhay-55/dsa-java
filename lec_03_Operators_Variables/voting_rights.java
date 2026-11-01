package lec_03_Operators_Variables;

import java.util.Scanner;

public class voting_rights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Can not vote");
		}

	}

}
