package by.training.arrays2.main;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки.

public class ArrInArrTask04 {

	public static void main(String[] args) {
		int[][] mas;
		Random rand = new Random();
		
		mas = new int[7][5];
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The first line---------------");

		for(int element : mas[0] ) {
			System.out.printf("[%3d]", element);
		}
		System.out.println();
		
		System.out.println();
        System.out.println("The last line---------------");
		
        for(int element : mas[mas.length - 1] ) {
			System.out.printf("[%3d]", element);
		}
		System.out.println();
	
	}

}
