/*
				There is a string 83515
				Print the below
				8
				3
				4
				1
				5
				83
				34
				41
				15
				834
				341
				415
				8341
				3415
				83415
 */
package lec_23_String_Question;

public class Length_Wise_Substring {

	public static void main(String[] args) {
		String s = "83415";
		printSubstring(s);

	}

	public static void printSubstring(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
