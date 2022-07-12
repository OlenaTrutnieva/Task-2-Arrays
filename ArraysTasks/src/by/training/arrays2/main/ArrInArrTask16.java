package by.training.arrays2.main;

public class ArrInArrTask16 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = (i + 1) * (i + 2);
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d] ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
