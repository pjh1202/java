package day02;

public class OperatorEx3 {
	//증감연산자 예제
	public static void main(String[] args) {
		
		int num1 = 1, num2 = 1;
		//num1은 전위형 증가 연산자, num2는 후위형 증가 연산자
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(++num1);
		System.out.println(num2++);
		System.out.println(num2);
	}

}
