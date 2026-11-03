/*
				   Question-27


				        1 
				      1 2 1 
				    1 2 3 2 1 
				  1 2 3 4 3 2 1 
				1 2 3 4 5 4 3 2 1 
				
 */

package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;

		while (row <= n) {
			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Value
			int j = 1;
			int val = 1;
			while (j <= star) {
				System.out.print(val + " ");
//				if (j < row) {
//					val++;
//				} else {
//					val--;
//				}
				
				if(j<=star/2) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}

			// Next Row Preparation
			row++;
			System.out.println();
			space--;
			star += 2;
		}

	}

}
