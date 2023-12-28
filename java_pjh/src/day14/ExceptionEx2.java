package day14;

public class ExceptionEx2 {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		int num1 = 1, num2 = 0;
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} finally {
			System.out.println("finally 실행"); //catch 후 return이 되는 경우 메서드를 빠져나가기 때문에
			                                   //실행이 안됨 finally는 반드시 실행되기 때문에 실행됨
		}
		System.out.println("메서드 종료");
	}
}
