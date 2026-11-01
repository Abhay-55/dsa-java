/*
Question-9

        	* 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 

*/

package lec_04_Pattern_Programs;

import java.util.Scanner;

public class Ques_09 {

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
				System.out.print("* ");
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

