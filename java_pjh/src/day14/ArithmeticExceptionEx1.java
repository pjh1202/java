package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {
	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드 작성
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.print("정수 산술연산자 정수입력 : ");
		int num1 = scanner.nextInt();
		char a = scanner.next().charAt(0);
		int num2 = scanner.nextInt();
		
		
			switch(a) {
			case '+': System.out.print(num1+num2); break;
			case '-': System.out.print(num1-num2); break;
			case '*': System.out.print(num1*num2); break;
			case '/': System.out.print(num1/num2); break;
			case '%': System.out.print(num1%num2); break;
			}
		} 
		catch (ArithmeticException e) {
				System.out.println("0으로 나누면 안됩니다.");
		}
		catch (InputMismatchException e) {
			System.out.println("입력을 잘 못했습니다.");
		}
	}
}