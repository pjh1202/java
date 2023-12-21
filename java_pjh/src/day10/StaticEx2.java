package day10;
/*
 * static 메서드
 * 클래스 메서드라고도 함
 * 클래스명.메서드명(매개변수); 형식
 */
public class StaticEx2 {

	public static void main(String[] args) {
		System.out.println(sum1(1,2));
		
		StaticEx2 ex = new StaticEx2();  //이런식으로 sum2를 호출하기 위해서는 인스턴스가 있어야 함
		ex.sum2(1, 2);
		//System.out.println(sum2(1,2)); //<-에러발생
	}
	public static int sum1(int num1, int num2) {
		return num1+num2;
	}
	public int sum2(int num1, int num2) {
		return num1+num2;
	}
	
	//인스턴스(객체) 메서드 : static이 없으니까
	public void test() {
		System.out.println(sum1(1,2));
		System.out.println(sum2(1,2));
	}
}
