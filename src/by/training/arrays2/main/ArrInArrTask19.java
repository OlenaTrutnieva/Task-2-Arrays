package by.training.arrays2.main;

public class ArrInArrTask19 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[7][7];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1) {
					arr[i][j] = 1;
			    }
				if (i == 1 || i == arr.length - 2) {
					if ((j == 1) || (j == arr[i].length - 2)) {
						arr[i][j] = 0;

						
					} else {
						arr[i][j] = 1;
					}

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}

	}

}
