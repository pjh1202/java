package day12;

public class OverrideEx1 {

	public static void main(String[] args) {
		//오버라이드 예제
		//print1은 접근 제어자가 protected이기 때문에 같은 패키지에서는 실행되지만, 다른 패키지에서는 실행안됨
		D d = new D();
		d.print1(); //오버라이딩을 이용하여 재정의된 메서드가 호출
		d.print2(); // 오버라이딩을 이용하여 재정의된 메서드가 호출
		d.print1(20); //오버로딩을 이용하여 추가된 메서드 호출
	}

}

class C{
	protected int num1 = 1, num2 = 2;
	
	protected void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public void print2() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
class D extends C{
	@Override
	/*@오버라이드가 있기 때문에 문법을 체크해줘서 오류가 뜸
	  1. 매개변수가 부모클래스에는 없음
      2. 부모클래스에서는 접근제어자가 protected였는데 여기선 default임
	void print1(int num1) { 
	}*/
	
	protected void print1() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	public void print2() {
		super.print2();
		System.out.println("B 클래스의 메서드입니다.");
	}
	protected void print1(int num1) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}