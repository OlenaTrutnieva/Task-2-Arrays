package by.training.arrays1.main;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

public class ArraysTask09 {

	public static void main(String[] args) {
		double[] arr;

		arr = new double[] { 434.6, 4, 35776.56, 0, 4.43, 4456.54 };

		double max;
		double min;
		int maxPosition;
		int minPosition;

		max = arr[0];
		min = arr[0];
		maxPosition = 0;
		minPosition = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%5.2f] ", arr[i]);
		}
		System.out.println();
		System.out.println();

		
        // находим наибольшее и наименьшее
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];	
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println(); 
		
		for (int j = 0; j < arr.length; j++) {
				if (arr[j] == min) {
					arr[j] = max;
				}
				if (arr[j] == min) {
					arr[j] = max;
				}
				System.out.printf("[%5.2f] ", arr[j]);
		}
			
	}

}
