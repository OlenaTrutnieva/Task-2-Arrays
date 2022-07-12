package by.training.arrays1.main;

// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class ArraysTask06 {

	public static void main(String[] args) {
		int[] mas;
		int[] pos;
		int[] neg;
		int countPos;
		int countNeg;
		
		countPos = 0;
		countNeg = 0;
		
		mas = new int[] {9, -10, 689, -436, 35679, -1, 35};
			
		// Отфильтровываем положительные значения
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%5d] ", mas[i]);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Searching for the biggest integer:");
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countPos++;
		    }
		}
		pos = new int[countPos];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				pos[j++] = mas[i];
			}
		}
		
		for (int i = 0; i < pos.length; i++) {
			System.out.printf("[%5d] ", pos[i]);
		}
		System.out.println();
				
		// Ищем наибольшее число
		int max;
		max = 0; 
				
		for (int i = 0; i < pos.length; i++) {
			if (pos[i] > max) {
				max = pos[i];
				}
			}
			System.out.println("max number = " + max);
		System.out.println();
		
		System.out.println();
		
				
		System.out.println("Searching for the smallest integer:");
		// Отфильтровываем отрицательные значения
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNeg++;
			}
		}
		
		neg = new int[countNeg];
		
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				neg[j++] = mas[i];
			}
		}
		
		for (int i = 0; i < neg.length; i++) {
			System.out.printf("[%5d] ", neg[i]);
		}
		System.out.println();
		
		int min;
		min = 0;
		
		for (int i = 0; i < neg.length; i++) {
			if (neg[i] < min) {
				min = neg[i];
				}
			}
			System.out.println("min number = " + min);
		System.out.println();
		
		// Вычисляем длину отрезка
		
		int line;
		line = Math.abs(max) + Math.abs(min);
		
		System.out.println("Line length is " + line);
	}

}
