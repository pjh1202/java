package day15;

public class LambdaEx1 {

	public static void main(String[] args) {
		// 람다 예제
		//인터페이스의 인스턴스를 생성하기 위해 구현 클래스 ClassA를 추가 후 ClassA를 이용하여 인스턴스 생성
		InterfaceA ia1 = new ClassA();
		ia1.print();
		
		//익명 클래스를 추가해서 인스턴스를 생성
		InterfaceA ia2 = new InterfaceA() {
			@Override
			public void print() {
				System.out.println("안녕하세요.");
			}
		};
		ia2.print();
		
		//람다식 이용 인터페이스의 추상메서드가 하나밖에 없기 때문에 ㅇ
		//람다식을 이용하여 익명 클래스를 추가한 후, 인스턴스를 생성
		InterfaceA ia3 = ()->{
			System.out.println("안녕하세요.");
		};
		ia3.print();
		
	}

}
/*InterfaceA는 추상메서드가 1개이기 때문에 함수형 인터페이스이고, 
 * @FunctionalInterface을 붙일 수 있다. <-안해도 되지만 문법적으로 체크해주는 기능이 생김. */
@FunctionalInterface
interface InterfaceA{
	void print();
	//void test(); <- @FunctionalInterface 를 붙였기 때문에 추상메서드를 추가하면 오류뜸
}

class ClassA implements InterfaceA{

	@Override
	public void print() {
		System.out.println("안녕하세요.");
	}
	
}