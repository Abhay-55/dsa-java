package lec_12_Array_Basic_Question;

public class Local_VS_Globlal_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		int x = 10;
		globalVariable(x);
		//Printing after changes in another function
		System.out.println("Global Variable in main Method: "+val);
		

	}
	//This is GLOBAL VARIABLE, Decleared outside method but inside class. 
	static int val = 100;
	public static void globalVariable(int a) {
		System.out.println(a);
		int val = 20;
		//Chaging value of Local Variable
		val = 120;
		//Changing in Global Variable
		Local_VS_Globlal_Variable.val = 80;
		System.out.println("Local Variable: "+val);
		System.out.println("Global Variable: "+Local_VS_Globlal_Variable.val);
	}

}
