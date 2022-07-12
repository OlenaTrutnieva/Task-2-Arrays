package by.training.arrays1.main;

// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или 
// отрицательное

public class ArraysTask03 {

	public static void main(String[] args) {
		int[] mas;

		mas = new int[] { -1, 1, 1, 12, 24, -45 };

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%3d]", mas[i]);
		}
		
		System.out.println();

		if (mas[0] < 0) {
			System.out.println("First integer is negative.");
		}
		if (mas[0] == 0) {
			System.out.println("First integer equals zero.");
		}
		if (mas[0] > 0) {
			System.out.println("First integer is positive.");
		}

	}

}
