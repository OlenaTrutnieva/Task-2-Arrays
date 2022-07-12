package by.training.arrays2.main;

import java.util.Random;

//  Дана матрица. Вывести на экран первый и последний столбцы

public class ArrInArrTask03 {

	public static void main(String[] args) {
		int[][] arr;

		arr = new int[8][15];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(128);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%3d] ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("The first column");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d]\n", arr[i][0]);
		}

		System.out.println();

		System.out.println("The last column");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d]\n", arr[i][arr[i].length - 1]);
		}
		System.out.println();

	}

}
