/*
  		Question-24
		       1 
		      2 2 2 
		    3 3 3 3 3 
		  4 4 4 4 4 4 4 
		5 5 5 5 5 5 5 5 5
 */

package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_24 {

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
			while(j<=star) {
				System.out.print(row+" ");
				j++;
			}
			
			// Next Row Preparation
			row++;
			System.out.println();
			space--;
			star+=2;
		}

	}

}
