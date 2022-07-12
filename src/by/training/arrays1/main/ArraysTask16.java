package by.training.arrays1.main;

// Даны действительные числа a1, a2, ..., an.Найти max( a1 + a2n, a2 + a2n-1, ..., an + a2n+1).
// Непонятна формулировка

public class ArraysTask16 {

	public static void main(String[] args) {
		double[] arr;
		double maxSum;
		double[] masSum;
		int count;
		
		arr = new double[] {823.6776, 12.4, -4.99, -246.6, 4.0, -146.8, 567.8, 0, 24, 10.23};
		count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			count++;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		System.out.println("count = " + count);
		System.out.println();
		
		masSum = new double[count];
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			masSum[j++] = arr[i] + (arr[arr.length-1]);
			
		}
		
		for (int i = 0; i < masSum.length; i++) {
			System.out.println("masSum[" + i + "] = " + masSum[i]);
		}
		System.out.println();

	}

}
