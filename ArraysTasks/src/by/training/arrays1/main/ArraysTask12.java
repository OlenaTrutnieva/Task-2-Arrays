package by.training.arrays1.main;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются 
// простыми числами

public class ArraysTask12 {

	public static void main(String[] args) {
		double[] arr;
		arr = new double[] {23.5, 12.9, 333.9, 1.45, 67.3, 248.4, 31, 45.3, 453.54, 3463.5, 45.4};
		double sum;
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		
		for (int i = 1; i < 3; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		for (int i = 4; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum = " + sum);

		for (int i = 4; i < arr.length; i++) {
			if ((i % 2 !=0) & (i % 3 !=0) & (i % 5 != 0)) {
				sum = sum + arr[i];
				System.out.println("arr[" + i + "]= " + arr[i]);
				System.out.println("Sum of all elements with order number prime  = " + sum);
			}
			System.out.println();
		}

	}

}
