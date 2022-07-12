package by.training.arrays2.main;

public class ArrInArrTask18 {

	public static void main(String[] args) {

		int[][] arr;
		arr = new int[7][7];

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				if (j <= i - 1) {
					arr[i][j] = 0;
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}

	}

}
