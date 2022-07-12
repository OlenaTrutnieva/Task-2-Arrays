package by.training.arrays1.main;

// Дана последовательность целых чисел  a1, a2, ..., an.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an)


public class ArraysTask17 {

	public static void main(String[] args) {
		int[] arr;
		int min;
		int count;
		
		arr = new int[] {34, 5, 24, 54345, 45, 4, 65, 23, 14, 4, 67, 24};
		min = arr[0];
		count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				count++;
			}
		}
		
		System.out.println("count = " + count);
		System.out.println();
		
		int[] mas;
		mas = new int[count];
		
		for (int i = 0, j =0; i < arr.length; i++) {
			if (arr[i] != min) {
				mas[j++] = arr[i];
			}
			
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "] = " + mas[i]);
		}
		System.out.println();

	}

}
