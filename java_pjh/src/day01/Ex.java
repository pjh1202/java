package day01;

public class Ex {

	public static void main(String[] args) {
		int n;
		for(int i=0 ;i<11;i++) {
			for(int j=0;j<11;j++) {
				if (j<i) {
					System.out.print("*");
				}
				else if(i==j) {
					System.out.println("\n");
				}
			}
		}

	}

}
