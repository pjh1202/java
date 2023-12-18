package day07;

import java.util.Scanner;

public class PrimeNumberMethodEx1 {

	public static void main(String[] args) {
		// 주어진 num이 소수인지 아닌지 판별하는 코드(메서드 이용)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		if(isPrimeNumber(num)) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		scanner.close();
	}
	
	public static boolean isPrimeNumber(int num) {
		isDivior(num);
		if(isDivior(num)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isDivior(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
