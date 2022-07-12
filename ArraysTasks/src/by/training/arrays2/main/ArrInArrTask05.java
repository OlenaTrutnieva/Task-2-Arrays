package by.training.arrays2.main;

import java.util.Random;

// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class ArrInArrTask05 {

	public static void main(String[] args) {
		int mas[][];
		Random rand = new Random();
		
		mas = new int[7][9];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		
		for (int i = 1; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%3d} ", mas[i][j]);
			}
			System.out.println();
		}
		
	}

}
