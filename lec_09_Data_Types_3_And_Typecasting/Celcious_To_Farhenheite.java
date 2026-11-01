package lec_09_Data_Types_3_And_Typecasting;

import java.util.Scanner;

public class Celcious_To_Farhenheite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int steps = sc.nextInt();
		for(int i = minf;i<=maxf; i = i + steps) {
			//5/9 -> 0 as int, 5.0/9 -> float
			int c = (int)((5.0 / 9)*(i - 32));
			System.out.println(i + "\t" + c);
			
		}

	}

}
