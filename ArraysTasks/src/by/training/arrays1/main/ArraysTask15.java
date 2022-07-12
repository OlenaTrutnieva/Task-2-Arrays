package by.training.arrays1.main;

// Дана последовательность действительных чисел a1, a2, ..., an. Указать те ее элементы, которые принадлежат отрезку [с, d]

import java.util.Random;

public class ArraysTask15 {

	public static void main(String[] args) {
		double[] arr;
		double c;
		double d;
		
		arr = new double[] { 823.6776, 12.4, -4.99, -246.6, 4.0, -146.8, 567.8, 0, 24, 10.23};
		c = -145.9;
		d = 12.4;
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3.4f] ", arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >+ c && arr[i] <= d) {
				System.out.printf("{%3.4f} ", arr[i]);
			}
			
		}
		System.out.println();

	}

}
