package by.training.arrays2.main;

public class ArrInArrTask12 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[10][10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = i;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d] ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
