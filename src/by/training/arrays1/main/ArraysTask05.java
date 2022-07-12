package by.training.arrays1.main;

// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
// Если таких чисел нет, то вывести сообщение об этом факте.

public class ArraysTask05 {

	public static void main(String[] args) {
		int[] mas;

		int count;
		count = 0;

		mas = new int[] { 1341, 55, 23, 49671, 2341, 8765, 1, 341, 4561 };

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d] ", mas[i]);
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
			;
		}

		int[] arr;
		arr = new int[count];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				arr[j++] = mas[i];
			}

		}

		if (count > 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("{%4d}", arr[i]);
			}
		} else {
			System.out.println("The subsequence does not contain even numbers.");
		}

	}

}
