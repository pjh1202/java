package day04;

import java.util.Scanner;

public class LcmEx1 {

	public static void main(String[] args) {
		// 두 정수의 최소 공배수 구하는 코드 작성
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 약수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 약수 입력 : ");
		int num2 = scanner.nextInt();
		int i = 1;
		
		for(i=1; i<num1*num2;i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
		//i가 num1부터 num1씩 증가 => i를 num1의 배수들로만 계산
		for(i=num1; i<num1*num2;i+=num1) {
			if(i%num2==0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
		scanner.close();
	}
}
