package day02;

public class OperatorEx2 {
	//산술연산자 예제
	public static void main(String[] args) {
		//정수 / 정수 = 정수(소수점 버려짐)
		int num1 = 1, num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		// /와 %는 0으로 나눌 수 없다 예외가 발생할 수 있음
		//0.0은 예외가 발생하지 않고 무한으로 계산이 된다.
	}
}
