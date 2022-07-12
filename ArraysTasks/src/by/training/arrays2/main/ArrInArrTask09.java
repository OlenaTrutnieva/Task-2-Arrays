package by.training.arrays2.main;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class ArrInArrTask09 {

	public static void main(String[] args) {
		int[][] mas;
		mas = new int[5][5];
		
		int[] arr;
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();	
		}
		System.out.println();	
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("{%3d} ", mas[i][j]);
				}
			}
		}

	}

}
