package by.training.arrays1.main;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, 
//положительных и нулевых элементов.

public class ArraysTask08 {

	public static void main(String[] args) {
		double[] mas;
		mas = new double[] {-0.435, 554.67, 0, 0.45, 0, 0};
		
		int countNeg;
		int countPos;
		int countZero;
		
		countNeg = 0;
		countPos = 0;
		countZero = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNeg++;
			}
		}
		System.out.println("Quantity of negative elements = " + countNeg);
		
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countPos++;
			}
		}
		System.out.println("Quantity of positive elements = " + countPos);
		
System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZero++;
			}
		}
		System.out.println("Quantity of zero elements = " + countZero);

	}

}
