/*
		 Question-20

		 
		      * 
		    *   * 
		  *       * 
		*           * 
		  *       * 
		    *   * 
		      *
		      
 */

package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space1 = n/2;
		int space2 = -1;
		
		while(row<=n) {
			
			//Space
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			//Star
			System.out.print("* ");
			
			//Between Space
			int j = 1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
				
			}
			
			//Star
			if(row == 1 || row == n) {
				System.out.print("");
			}
			else {
			System.out.print("* ");
			}
			
			//next Row
			//Mirror
			if(row<=n/2) {
				space1--;
				space2 += 2;
			}
			else {
				space1++;
				space2 -= 2;
			}
			
			row++;
			System.out.println();
		}
		

	}

}
