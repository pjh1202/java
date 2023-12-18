package day07;

public class MethodEx1 {

	public static void main(String[] args) {
		/*
		 * 두 정수의 합을 알려주는 메서드
		 * 매개변수 : 
		 * 리턴타입 : 
		 * 메서드명 : 
		 */
		
		int num1 =1, num2 = 2;
		int result = sum(num1, num2);
		System.out.println(result);
		result = sum(10, 20);
		System.out.println(result);

	}
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
