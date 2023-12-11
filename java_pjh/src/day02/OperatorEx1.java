package day02;

/*
 * 대입연산자 예제
 */

public class OperatorEx1 {
	
	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		num1 = 10;
		
		//10 = num1; <-- 불가능 리터럴 10을 num1 값으로 변경할 수 없기 때문에 에러 발생
		
		int num3;
		num3 = num1 + num2;
		//num1 + num2 = num3; <-- 불가능 왼쪽에는 변수, 상수만 올 수 있음
		System.out.println(num3);
		
	}

}
