package by.training.arrays1.main;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class ArraysTask01 {

	public static void main(String[] args) {
	   int[] mas;
	   int k;
	   int sum;
	   
	   mas = new int[] {20, 23, 60, 45, 35574, 5767, 996, 107};
	   k = 2;
	   sum = 0;
	   
	   for(int i = 0; i < mas.length; i++) {
		   if(i == mas.length - 1) {
			   System.out.print("mas[" + i + "] = " + mas[i] + ". ");
		   }
		   else {
			   System.out.print("mas[" + i + "] = " + mas[i] + ", ");
		   }
	   }
	   
	   System.out.println();
	   
		   for(int i = 0; i < mas.length; i++) {
			   if(mas[i] % k == 0) {
				   sum = sum + mas[i];
				   System.out.println("mas[" + mas[i] + "]");
		   }
	   }
	   
	   

	}

}
