package by.training.arrays1.main;

import java.util.Random;

//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1) 

public class ArraysTask11 {

	public static void main(String[] args) {
		
		int l;
		int m;
		double[] arr;
		Random rand = new Random();
		
		l = 2;
		m = 5;
		arr = new double[] {11, 1, 45, 34, 122, 88, 99, 44, 22, 11};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3.2f]", arr[i]);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % m == l) {
				System.out.printf("{%2.2f}", arr[i]);
			}
			
		}

	}

}
