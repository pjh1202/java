package day14;

import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		//두 정수와 산술연산자를 입력받아 결과를 출력하는 메서드 구현
		//메서드 이용, throws와 throw를 이용
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 산술연산자 입력 : ");
		try {
			int num1 = scanner.nextInt();
			char op = scanner.next().charAt(0);
			int num2 = scanner.nextInt();
			System.out.println(calculate(num1, op, num2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static double calculate(int num1, char op, int num2) {
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '*': return num1 * num2;
		case '/': 
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1 / num2;
		case '%': 
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1 % (double)num2;
		default: 
			throw new RuntimeException(op + "은(는) 산술연산자가 아닙니다.");
		}
	}
}
