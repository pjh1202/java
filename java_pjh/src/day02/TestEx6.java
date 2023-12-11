package day02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/*
		 * 산술연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 */
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		char a;
	
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = scanner.nextInt();
		System.out.print("산술연산자를 입력하세요 : ");
		a = scanner.next().charAt(0);
		
		if(a == '+') {
			num3 = num1 + num2;
			System.out.println(num1 +" " + a + " " + num2 + " = " + num3);
		}
		else if (a == '-') {
			num3 = num1 - num2;
			System.out.println(num1 +" " + a + " " + num2 + " = " + num3);
		}
		else if (a == '*') {
			num3 = num1 * num2;
			System.out.println(num1 +" " + a + " " + num2 + " = " + num3);
		}
		else if (a == '/') {
			num3 = num1 / num2;
			System.out.println(num1 +" " + a + " " + num2 + " = " + num3);
		}
		else if (a == '%') {
			num3 = num1 % num2;
			System.out.println(num1 +" " + a + " " + num2 + " = " + num3);
		}
		else {
			System.out.println("잘못된 연산자 입력");
		}
	}
}
