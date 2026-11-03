package lec_10_Functions;

public class Demo_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 10;
		int i = 10;
		int j = 15;
		System.out.println(a + b);
		Add(i,j);
	}

	public static void Add(int x, int y) {
		int c = x + y;
		System.out.println(c);
	}
}
