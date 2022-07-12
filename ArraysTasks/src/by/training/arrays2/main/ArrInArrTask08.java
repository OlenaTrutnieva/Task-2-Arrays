package by.training.arrays2.main;

import java.util.Random;

// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива

public class ArrInArrTask08 {

	public static void main(String[] args) {
		int[][] mas;
		mas = new int[7][9];
		
		int count;
		count = 0;
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();	
		}
		
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count++;
				}
			}
			
		}
		System.out.println("7 appeared " + count + " times.");
	

	}

}
