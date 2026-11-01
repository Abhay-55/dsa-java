/*
				Question-2
				
				* 
				* * 
				* * * 
				* * * * 
				* * * * *
*/

package lec_04_Pattern_Programs;
import java.util.*;

public class Ques_02 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int row = 1;
	int star = 1;
	while(row<=n) {
		int i = 1;
		while(i<= star) {
			System.out.print("* ");
			i++;
		}
		row++;
		star++;
		System.out.println();
	}
	

}

}
