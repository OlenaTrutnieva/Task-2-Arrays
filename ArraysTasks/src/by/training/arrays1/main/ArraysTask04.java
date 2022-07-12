package by.training.arrays1.main;

import java.util.Random;

// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class ArraysTask04 {

	public static void main(String[] args) {
		int[] mas;

		mas = new int[] {1, 2, 3, 4, 6, 5};

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%3d]", mas[i]);
		}

		System.out.println();

		int y;
		y = mas[0];
		
		for (int i = 1; i < mas.length; i++) {
			if (y <= mas[i]) {
				y = mas[i];
				System.out.println("y = " + y);
			}else {
				break;
			}	
		}
		
		int n;
		n = mas.length - 1;
			
		if (y != mas[n]) {
			System.out.println("Sequence of numbers is Not ascending.");
		}
		
		if (y == mas[n]) {
			System.out.println("Sequence of numbers is ascending.");
		}

	}

}
