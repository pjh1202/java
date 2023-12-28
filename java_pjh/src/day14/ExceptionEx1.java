package day14;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 0;
		//catch는 순서대로 동작
		
		//ArithmeticException 발생 : 0으로 나누어서
		try {
			System.out.println(num1/num2);
		}
		//ArithmeticException의 부모인 RuntimeException이 위에 오면 안됨
		/*catch (RuntimeException e) {
			//위에서부터 탐색하기 때문에 위에서 걸리면 밑에서 검사안함
		}*/
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "잘못된 번지입니다.");
		}
		//runtimeException은 ArithmeticException의 조상이기 때문에 오류를 잡음
		catch (ArithmeticException e) {
			System.out.println(e + " 오류발생 프로그램을 종료합니다.");
		}
		catch (Exception e) {
			System.out.println("모든 예외를 처리합니다.");
		}
		
	}
}
