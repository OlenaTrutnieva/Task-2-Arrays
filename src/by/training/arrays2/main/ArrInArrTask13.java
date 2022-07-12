package by.training.arrays2.main;

public class ArrInArrTask13 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[7][7];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1;
				System.out.printf("[%1d] ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || ((i % 2) == 0)) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("[%1d] ", arr[i][j]);
				}
				System.out.println();
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.printf("{%1d} ", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
	
}
