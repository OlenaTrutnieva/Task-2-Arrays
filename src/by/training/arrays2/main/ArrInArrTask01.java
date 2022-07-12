package by.training.arrays2.main;

public class ArrInArrTask01 {

	public static void main(String[] args) {
		int [][] mas = new int[3][4];
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 0;
			}
			for(int element : mas[0]) {
				mas[i][0] = 1;
			}
			
		}
	
	    for(int i = 0; i<mas.length; i++) {
		    for(int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}

