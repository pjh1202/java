package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/*
		 * 		*
		 *     ***
		 *    삼각형 모양으로 출력 1 3 5 7 9
		 */ 
		
		int row = 5;
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=row - i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
