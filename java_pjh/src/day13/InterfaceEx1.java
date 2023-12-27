package day13;
//static이 붙은 메서드 = 정적메서드
public class InterfaceEx1 {
	public static void main(String[] args) {
		System.out.println(KiaCar.brand); //static이 붙어있기 때문에 인스턴스 없이 호출 가능
		Printer.print();
	}
}
class KiaCar{
	public static String brand = "기아";
}

interface Printer{
	
	//static 메서드들은 메인에서 인스턴스 없이 호출이 가능하기 때문에 반드시 구현해둬야 함
	static void print() { 
		System.out.println("프린터입니다.");
	}
	
	//static이 안붙은 메서드들은 추상메서드로 만들어서 구현하지 않거나
	void test();
	//default 메서드로 만들어서 구현
	default void test2() {}
}
