package by.training.arrays2.main;

// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов

public class ArrInArrTask07 {

	public static void main(String[] args) {
		int[][] mas;
		mas = new int[][] { { -1, 1, -2, 2, 3 }, { -1, -1, -2, 2, 3 }, { 1, 1, -2, 2, -3 }, { -1, 1, -2, 2, 3 },
				{ -1, 1, -5, 2, -3 } };

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Negative uneven elements:");

		int count;
		count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					if (mas[i][j] % 2 != 0) {
						count++;
					}
				}

			}

		}
		System.out.println("Count: " + count);

		System.out.println();

		System.out.println("Array created of negative unevan elements:");

		int[] arr;
		arr = new int[count];

		int sum;
		sum = Math.abs(arr[0]);

		for (int i = 0, k = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					if (mas[i][j] % 2 != 0) {
						arr[k] = mas[i][j];
						System.out.printf("{%3d} ", arr[k]);

						sum = sum + Math.abs(arr[k]);
					}
				}

			}

		}
		System.out.println();

		System.out.println("Sum module = " + sum);

	}

}
