/*
Question-1


 * * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * *  
*/

package lec_04_Pattern_Programs;

import java.util.*;

public class Ques_01 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int row = 1;
	while (row <= n) {
		int star = 1;
		while (star <= n) {
			System.out.print("* ");
			star++;
		}

		// next row preparation
		System.out.println();
		row++;
	}

}

}
