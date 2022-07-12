package by.training.arrays2.main;

import java.util.Random;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class ArrInArrTask06 {

	public static void main(String[] args) {
		int[][] mas;
		mas = new int[8][10];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(999);
				System.out.printf("[%3d]" , mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j = j + 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
				System.out.printf("{%3d} ", mas[i][j]);
				}
			}
			System.out.println();
		}

	}

}
