package by.training.arrays2.main;

public class ArrInArrTask15 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[7][7];
		
		for (int i = arr.length -1; i >= 0; i--) {
			for (int j = arr[i].length -1; j >= 0; j--) {
				if (i == j) {
					arr[i][j] = i + 1;
					System.out.printf("[%1d] ", arr[i][j]);
				}
				else {
					arr[i][j] = 0;
					System.out.printf("[%1d] ", arr[i][j]);
				}
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
