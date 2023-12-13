package day03;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		//continue 이용하여 짝수 출력
		//홀수면 건너뜀 짝수면 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		for(int i = 2; i<=num; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			else {
				continue;
			}
		}
	}
}
