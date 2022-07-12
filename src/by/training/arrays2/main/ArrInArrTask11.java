package by.training.arrays2.main;

import java.util.Random;

// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая 
// строка слева направо, третья строка справа налево и так далее.

public class ArrInArrTask11 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[9][9];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%4d] ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || ((i % 2) == 0)) {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.printf("{%4d} ", arr[i][j]);
				}
				System.out.println();
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("[%4d] ", arr[i][j]);
				}
				System.out.println();

			}

		}

	}

}
