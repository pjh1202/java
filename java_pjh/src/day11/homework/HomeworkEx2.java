package day11.homework;

import java.util.Scanner;

public class HomeworkEx2 {
	/*
	 * 두 정수와 산술 연산자를 입력받아 결과를 출력하는 코드
	 * 메서드 생성해서 이용
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수와 연산자를 입력해주세요");
		int num1 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int num2 = scanner.nextInt();
		System.out.println(printResult(num1,num2,operator));
	}
	/**두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
	 * @param num1 정수1
	 * @param num2 정수2
	 * @param operator 산술연산자
	 * @return num1 정수1과 정수2를 산술연산한 결과*/
	

	private static double printResult(int num1, int num2, char operator) {
		switch(operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		case '%':
			return num1 % num2;
		default :
			System.out.println("잘못된 산술연산자 입니다.");
			return 0;
		}
	}
}
