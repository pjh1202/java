package day03;

import java.util.Scanner;

public class SwtichEx {

	public static void main(String[] args) {
		//산술 연산자와 두 정수를 입력받아 산술 연산자에 맞는 연산 결과 출력 switch문 사용
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scanner.nextInt();
		System.out.print("산술연산자 입력 : ");
		char operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.print(num1+num2);
			break;
		case '-':
			System.out.print(num1-num2);
			break;
		case '*':
			System.out.print(num1*num2);
			break;
		case '/':
			System.out.print(num1/num2);
			break;
		case '%':
			System.out.print(num1%num2);
			break;
		}
		

	}

}
