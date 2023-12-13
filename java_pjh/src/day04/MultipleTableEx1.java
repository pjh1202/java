package day04;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력
		
		for(int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + " = " + i*j);
			}
		}
	}
}