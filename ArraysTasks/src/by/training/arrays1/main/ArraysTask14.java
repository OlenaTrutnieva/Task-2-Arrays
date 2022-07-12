package by.training.arrays1.main;

// Дан одномерный массив A[N]. Найти:
// max(a2, a4, ..., a2k ) + min(a1, a3, ..., a2k+1)

import java.util.Random;

public class ArraysTask14 {

	public static void main(String[] args) {
		int[] arr;
		int max;
		int min;
		
		Random rand = new Random();
		arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99);
		}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();
		
		
		max = arr[1];
		min = arr[0];
		System.out.println("max = " + max + ", min = " + min);
		
		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[i] > max) {
					max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i = i + 2) {
			if (arr[i] < min) {
					min = arr[i];
			}
		}
		System.out.println("max1 = " + max + ", min1 = " + min);
		
		int sum;
		sum = max + min;
		System.out.println("Sum of max and min = " + sum);
		
	}

}
