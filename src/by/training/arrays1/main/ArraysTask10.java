package by.training.arrays1.main;

import java.util.Random;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class ArraysTask10 {

	public static void main(String[] args) {
		int[] mas;
		mas = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.printf("[%3d] ", mas[i]);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.printf("{%3d} ", mas[i]);
			}
		}

	}

}
