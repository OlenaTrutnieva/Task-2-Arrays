package by.training.arrays1.main;

import java.util.Random;

// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент 
// (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

public class ArraysTask20 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[10];
		Object String = null;

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			if (i % 2 != 0) {
				arr[i] = rand.nextInt(100);
				System.out.println("[arr[" + i + "]= " + arr[i]);
			}

			if (i % 2 == 0) {
				System.out.println("null");
			}
			
			

		}

	}

}
