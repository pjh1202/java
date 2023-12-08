package day01;

public class VariableEx2 {

	public static void main(String[] args) {
		//정수형 변수 선언 예제
		byte num1 = 1; // byte는 127까지 표현 가능
		System.out.println(num1);
		
		byte num1_1 = (byte)(127 + 1);
		System.out.println(num1_1);
		//오버플로우 발생 한바퀴 돌아서 다시 돌아와서 -128이 됨
		
		byte num1_2 = (byte)(128-1);
		System.out.println(num1_2);
		//언더플로우 발생
		
		int num2 = 128; // int도 해당 범위를 넘어가는 수를 저장하면 안됨
		System.out.println(num2);
		
		//int num2_2 = 123456789123; 
		//System.out.println(num2_2); <-- 인트 범위 넘어서 에러뜸
		
		int num2_3 = 010; // 8진수 10 => 10진수 8
		int num2_4 = 0x10; // 16진수 10 => 10진수 16
		int num2_5 = 0b10; // 2진수 10 => 10진수 2
		System.out.println(num2_3);
		System.out.println(num2_4);
		System.out.println(num2_5);
		
		long num3 = 123456789123L; // 오른쪽 기본 타입이 인트임
		System.out.println(num3); // 뒤에 L 붙여서 기본타입 변경	
		
		//실수 - 근사치이기 때문에 항상 오차가 발생
		
		
		
	}
}
