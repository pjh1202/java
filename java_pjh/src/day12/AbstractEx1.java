package day12;

public class AbstractEx1 {

	public static void main(String[] args) {
		// 추상메서드 예제
		
		//AA 추상클래스는 추상메서드가 없지만 추상클래스를 이용하여 인스턴스를 생성할 수 없음 
		//AA aa1 = new AA(); <-에러발생
		
		//추상클래스에 인스턴스를 만들려면 익명클래스를 이용하거나
		AA aa1 = new AA() {
			
		};
		//추상클래스를 상속받은 일반 클래스를 생성해서 인스턴스를 생성(업캐스팅)
		AA aa2 = new CA();
		
		DA da1 = new DA();
		da1.print();
	}
	
}

abstract class AA{
	//추상클래스이므로 이 클래스에는 인스턴스를 직접 만들 수 없음
	int num;
}
abstract class AB{
	int num;
	public abstract void print(); //메서드가 ;으로 끝남
}

class CA extends AA {
	//추상클래스를 상속받는 일반클래스
}

class DA extends AB{
	//AB추상클래스에는 추상메서드가 있기 때문에 
	//DA클래스를 추상클래스로 만들던가 (abstract 붙이기)
	//오버라이딩을 통해 추상메서드를 재정의해야 함
	
	@Override
	public void print() {
		System.out.println("num : " + num);
	}
	
}