package by.training.arrays1.main;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел 

// несколько, то определить наименьшее из них.

public class ArraysTask19 {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[] { 1, 2, 2, 3, 3, 3 };
		int[] arrDuplicate;
		arrDuplicate = arr;
		int[] mas;
		int quont =0;
		int count = 0;

		
		for (int i = 0; i < arr.length; i++) {
			quont++;
			System.out.printf("[%2d] ", arr[i]);
			
		}
		System.out.println();
		System.out.println("quont =" + quont);
		
		mas = new int[quont];
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			for (int k = arrDuplicate.length - 1; k >=0 ; k--) {
				if (arr[i] == arrDuplicate[k] ) {
				count++;
			    }
				System.out.println(count);
				
			}
			mas[j++] = count;
			
		
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		
		    System.out.println();

	}

}
