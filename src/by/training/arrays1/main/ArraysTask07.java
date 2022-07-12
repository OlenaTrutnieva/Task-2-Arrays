package by.training.arrays1.main;

// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. 
//Подсчитать количество замен.

public class ArraysTask07 {

	public static void main(String[] args) {
		double[] mas;
		mas = new double[] {34.6, 346.098, 43.3, 0.3454, 0.0078, 123457.466567, 4.56, 564.435, -435.54, -53445.4};
		
		double z;
		z = 2.5;
		
		int count;
		count = 0;
		
		for(int i = 0; i < mas.length; i++) {
			System.out.printf("[%6.2f]", mas[i]);
		}

		
		for(int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		
		System.out.println();
	    System.out.println();
		
	    System.out.println("Data in cells updated:");
		for(int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;             
			}
			System.out.printf("[%1.4f]", mas[i]);
		}
		
		System.out.println();
		System.out.println("Quantity of updates:" + count);

	}

}
