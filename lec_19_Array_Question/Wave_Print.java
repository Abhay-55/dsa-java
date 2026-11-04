package lec_19_Array_Question;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

		// first row-> {1,2,3,4} second row-> {5,6,7,8} and so on
		wavePrint(arr);
	}

	public static void wavePrint(int[][] arr) {
		for (int column = 0; column < arr[0].length; column++) {
			if (column % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][column] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][column] + " ");
				}
			}
			System.out.println();
		}
	}

}
