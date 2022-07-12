package by.training.arrays1.main;

import java.util.Random;

// Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в 
// промежутке от L до N

public class ArraysTask13 {

	public static void main(String[] args) {
		
		int[] arr;
		int m;
		int l;
		int n;
		
		arr = new int[12];
		m = 2;
		l = 3;
		n = 9;
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();
		
		for (int i = (l - 1); i <= (n - 1); i++) {
			if (arr[i] % m == 0) {
				System.out.printf("{%3d} ", arr[i]);
			}
		}

	}

}
