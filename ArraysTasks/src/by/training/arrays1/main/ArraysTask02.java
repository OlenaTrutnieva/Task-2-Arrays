package by.training.arrays1.main;

// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов

public class ArraysTask02 {

	public static void main(String[] args) {
		int[] mas = new int[] { 67, 0, 234, 129, 0, 0, 1, -0, 45656, 00, -45, 46, 62457, 0, 976, -786, 0, 543, 0, 9 };
		int countZero = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZero++;
			}
		}

		int[] arr = new int[countZero];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				arr[j++] = i;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]; ", mas[i]);
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("{%d} ", arr[i]);
		}

	}
}