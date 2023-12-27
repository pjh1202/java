package day13;
//인터페이스 예제
public interface Program {
	int num1 = 10; // 변수앞에 final static 이 자동으로 추가되어 있음
	               // 따라서 초기화를 명시적으로 해줘야 함
	final static int num2 = 20; //final static 을 붙여도 똑같음
	
	//메서드 앞에 public abstract 가 자동으로 추가되어 있음
	void printMenu();
	
	public void runMenu(int menu);//인터페이스에서는 runMenu나 printExit이나 같은 추상메서드임 생략되어 있을 뿐
	public abstract void printExit();
	void run();
	
}

abstract class TestA{ //추상메서드가 있는 클래스는 추상클래스여야 함으로 abstract 가 붙어야 함
	//클래스에서는 final static 을 생략하면 멤버변수, 붙이면 상수
	int num1 = 10; //그냥 멤버변수임
	final static int num2 = 20;
	
	//클래스에서는 추상 메서드에 abstract 가 자동으로 추가되지 않음
	public abstract void printMenu();
}

//인터페이스 구현과 형변환
/*class 클래스명 implements 인터페이스명 {
 * 		메서드 오버라이딩
 *
	}*/