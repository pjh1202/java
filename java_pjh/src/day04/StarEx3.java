package day04;

public class StarEx3 {

	public static void main(String[] args) {
		/*
		 * 오른쪽으로 붙은 * 삼각
		 * 
		 */

		for(int i=5; i>=1; i--) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
