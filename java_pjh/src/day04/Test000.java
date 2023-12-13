package day04;

public class Test000 {

	public static void main(String[] args) {
		int row = 5;
		for (int i=5; i>=1; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//9 7 5 3 1