package by.training.arrays2.main;

import java.util.Random;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class ArrInArrTask10 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[7][7];
		
		Random rand = new Random();
		
		for (int k = 0; k < arr.length; k++) {
			for (int p = 0; p < arr[k].length; p++) {
				arr[k][p] = rand.nextInt(100);
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			for (int p = 0; p < arr[k].length; p++) {
				System.out.printf("[%3d]", arr[k][p]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Line #3:");
		for (int element : arr[2]) {
				System.out.printf("{%3d}", element);
		}
		System.out.println();
		
        System.out.println();
		
		System.out.println("Column 5:");
		for (int i = 0; i < arr.length; i++) {
				System.out.printf("{%3d}\n", arr[i][4]);
		}
		System.out.println();
	}

}
