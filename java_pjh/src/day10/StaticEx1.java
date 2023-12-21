package day10;
/*
 * 하나의 클래스로 만든 모든 인스턴스가 공통적인 값을 가지는 속성이 있는 경우 static을 붙임
 * 프로그램이 실행되어 메모리에 올라갔을 때 한번 메모리에 공간이 할당
 * ex) kiaCar에서 사용하는 브랜드는 KIA로 모든 인스턴스가 같은 값을 이용함
 * 이럴 때 static을 이용하면 모든 값을 한번에 관리할 수 있음.
 * 접근제어자 static 자료형 변수명;
 */
public class StaticEx1 {

	public static void main(String[] args) {
		KiaCar kiaCar1 = new KiaCar("모닝");
		KiaCar kiaCar2 = new KiaCar("레이");
		KiaCar kiaCar3 = new KiaCar("K3");
		//KiaCar에서 브랜드는 static이 아니기 때문에 kiaCar1의 브랜드만 바뀜
		kiaCar1.brand = "기아";
		kiaCar1.print();
		kiaCar2.print();
		kiaCar3.print();
		
		System.out.println();
		kiaCar2.brand = "기아"; //<-인스턴스가 생성되기 전에 이미 메모리에 올라와 있기 때문에 미리 접근도 할 수 있음
		KiaCar2 kiaCar4;
		kiaCar4 = new KiaCar2("모닝");
		KiaCar2 kiaCar5 = new KiaCar2("레이");
		KiaCar2 kiaCar6 = new KiaCar2("K3");
		//KiaCar2에서 브랜드는 static이기 때문에 하나만 바꿔줘도 "기아"로 다 바뀜
		//kiaCar4.brand = "기아"; <-이런식으로 인스턴스를 통해서 접근이 가능하지만
		KiaCar2.brand = "기아"; //<-static변수는 클래스명을 통해 접근해야 함
		kiaCar4.print();
		kiaCar5.print();
		kiaCar6.print();
		
		//안만들었는데도 호출할 수 있음 
		System.out.println("대표적인 static변수 Math.PI" + Math.PI);
		
	}
}

class KiaCar {
	public String brand = "KIA";
	public String name; // 차 이름
	
	public KiaCar(String name) {
		this.name = name;
	}
	public void print() {
		System.out.print(brand);
		System.out.println("차 이름 : " + name);
	}
	
}

class KiaCar2 {
	public static String brand = "KIA";
	public String name; // 차 이름
	
	public KiaCar2(String name) {
		this.name = name;
	}
	public void print() {
		System.out.print(brand);
		System.out.println("차 이름 : " + name);
	}
	
}