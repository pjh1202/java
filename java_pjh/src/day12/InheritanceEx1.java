package day12;

public class InheritanceEx1 {

	public static void main(String[] args) {
		// 상속 예제
		KiaCar k1 = new KiaCar("k3", 4);
		k1.print();
	
		HyundaiCar h1 = new HyundaiCar("아반떼", 4);
		h1.print();
	}

}

//자동차
class Car {
	String name, brand;
	int wheelCount; // 자동차 바퀴 수
	boolean power;
	int speed;
	
	void turn() {
		power = !power;
	}
	void speed(int speed) {
		this.speed += speed;
	}
	
	public Car(String name, String brand, int wheelCount) {
		this.name = name;
		this.brand = brand;
		this.wheelCount = wheelCount;
	}
	
	public Car() {}
	public void print() {
		System.out.println("회사 : " + brand);
		System.out.println("차명 : " + name);
		
	}
}

//기아차 : 기아자동차는 자동차이다. O
class KiaCar extends Car {
	public KiaCar(String name, int wheelCount) {
		/*brand = "기아";
		this.name = name;
		this.wheelCount = wheelCount;*/
		super(name, "기아", wheelCount); //this처럼 super위에 다른 코드가 오면 안됨!
	}
}


//현대차 : 현대자동차는 자동차이다. O
class HyundaiCar extends Car {
	public HyundaiCar(String name, int wheelCount) {
		super(name, "현대",wheelCount);
	}
}