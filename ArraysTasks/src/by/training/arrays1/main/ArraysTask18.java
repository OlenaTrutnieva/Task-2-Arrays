package by.training.arrays1.main;

//«Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить 
// игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на 
// передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, 
// которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки

public class ArraysTask18 {

	public static void main(String[] args) {
		int[] arr;
		int[] mas;
		arr = new int[10];
		mas = new int[] {1, 2, 3, 4, 5, 6};
		int sum;
		
		arr[0] = 3;
		arr[1] = 1;
		sum = 10;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = sum - arr[i - 1] - arr[i - 2];
			System.out.printf("[%2d] ", arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("{%2d} ", arr[i]);
			
		}
	}

}
