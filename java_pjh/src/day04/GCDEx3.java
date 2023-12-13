package day04;

import java.util.Scanner;

public class GCDEx3 {

	public static void main(String[] args) {
		/*
		 * 두 정수의 최대공약수를 출력하는 코드
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 약수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 약수 입력 : ");
		int num2 = scanner.nextInt();
		int gcd=1;
		for(int i = 1; i<=num1; i++) {
			if(num1%i == 0 || num1 == i) {
				for(int j = 1; j<=num2; j++) {
					if(num2%j == 0|| num2 == j) {
						if(i==j) {
							gcd = j;
						}
					}
				}
			}
		}
		System.out.println("최대공약수 : " + gcd);
		scanner.close();
	}
}
