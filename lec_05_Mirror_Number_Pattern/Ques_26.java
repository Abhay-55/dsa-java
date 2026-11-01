/*
               Question-26  
			        1 
			      1 2 3 
			    1 2 3 4 5 
			  1 2 3 4 5 6 7 
			1 2 3 4 5 6 7 8 9
 */
package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int star = 1;
		
		while(row<=n) {
			// Space
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			// Star
			int j = 1;
			int val = 1;
			while(j<=star) {
				System.out.print(val+" ");
				j++;
				val++;
			}
			
			// Next Row Preparation
			row++;
			System.out.println();
			space--;
			star+=2;
		}


	}

}
