package lec_22_String;

public class Lexicographically_Comapre {

	public static void main(String[] args) {
		String s1 = "kamal";
		String s2 = "komal";
		System.out.println(compareTwoString(s1, s2));

	}

	public static int compareTwoString(String s1, String s2) {
		if (s1 == s2) {
			// s1 and s2 are same
			return 0;
		}
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return (s1.charAt(i) - s2.charAt(i));
				// >0 means s1>s2 or <0 means s2>s1
			}
		}
		return s1.length() - s2.length();
	}

}
