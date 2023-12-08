package day01;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		// 자동 자료형 변환 예제
		//정수를 실수로 변환할 때
		//작은 자료형 값을 큰 자료형으로 변환할 때
		//자동형변환이 안된다는 것은 데이터 손실이 있을 수 있다는 것.
		
		//리터럴 1은 타입이 int, num1 은 타입 double
		//리터럴 1을 num1에 저장하기 위해 int를 double로 자동 형변환해서 저장
		double num1 = 1;
		System.out.println(num1);
		
		//리터럴2는 타입 int이고, num2는 타입이 long
		//자동형변환에 의해 int값 2를 long에 저장
		long num2 = 2;
		
		//'a'의 아스키코드 값인 97이 num3에 저장됨
		char ch = 'a';
		int num3 = ch;
		System.out.println(num3);
		
	}
}
