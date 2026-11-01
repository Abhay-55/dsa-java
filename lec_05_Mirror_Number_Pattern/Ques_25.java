/*
		  		   Question-25
		  				1	
					2	3	4	
				5	6	7	8	9	
			10	11	12	13	14	15	16	
		17	18	19	20	21	22	23	24	25	

 */

package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Ques_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = 1;
		int row = 1;
		int space = n-1;
		int star = 1;
		
		while(row<=n) {
			// Space
			int i =1;
			while(i<=space) {
				System.out.print("\t"); // Tab
				i++;
			}
			
			// Star
			int j = 1;
			while(j<=star) {
				System.out.print(value+"\t");
				j++;
				value++;
			}
			
			// Next Row Preparation
			row++;
			System.out.println();
			space--;
			star+=2;
		}

	}

}
