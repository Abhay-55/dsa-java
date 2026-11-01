package lec_05_Mirror_Number_Pattern;

import java.util.Scanner;

public class Hard_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		int val = 1;
		while(row<=2*n - 1) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//Star
			int j = 1;
			int p = val;
			while(j<=star) {
				System.out.print(p+" ");
				if(j<=star/2) {
					p++;
				}
				else {
					p--;
				}
				j++;
			}
			
			//Next Row Preparation
			//Mirror
			if(row<n) {
				star +=2;
				space--;
				val++;
			}
			else {
				star -=2;
				space++;
				val--;
			}
			
			row++;
			System.out.println();
		}

	}

}
