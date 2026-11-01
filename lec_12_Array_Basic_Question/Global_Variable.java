package lec_12_Array_Basic_Question;

public class Global_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		int x = 10;
		globalVariable(x);
		//Printing after changes in another function
		System.out.println(val);
		

	}
	//This is GLOBAL VARIABLE, Decleared outside method but inside class. 
	static int val = 100;
	public static void globalVariable(int a) {
		System.out.println(a);
		//Chaging value of global variable
		val = 120;
		System.out.println(val);
	}

}
