/*
		 Question-19

		 
		* * * * * * * 
		* * *   * * * 
		* *       * * 
		*           * 
		* *       * * 
		* * *   * * * 
		* * * * * * * 

 */

package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star=n/2 + 1;
		int space = -1;
		while(row<=n) {
			//Star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			//Space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			//Star
			int k = 1;
			if(row == 1 || row == n) {
				k = 2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			//Next Row Preparation
			//mirroring
			if(row<=n/2) {
				star--;
				space += 2;
				
			}
			else {
				star++;
				space -= 2;
			}
			
			row++;
			System.out.println();
			
			
			
		}
		

	}

}
