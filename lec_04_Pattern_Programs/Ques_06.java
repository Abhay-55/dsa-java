/*
				Question-6
				
				* * * * * 
				  	* * * * 
				  		* * * 
				  			* * 
				              	*
*/

package lec_04_Pattern_Programs;

import java.util.Scanner;

public class Ques_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 0;
		int star = n;

		while (row <= n) {

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// Next Row Preparation
			row++;
			System.out.println();
			space = space + 2;
			star--;
		}
	}

}
