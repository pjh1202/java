package day12;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		/* 
		 * 디형성 예제
		 * 1. 매개변수의 다형성
		 * 
		 */
		Remocon r = new Remocon();
		Tv tv = new Tv();
		AirConditioner aircon = new AirConditioner();
		r.turnOn(tv);
		r.turnOn(aircon);//turnOn은 부모클래스에만 있는 메서드이지만 자식클래스 둘 다 모두 호출가능
		
	}

}

//리모컨 : TV나 에어컨등을 조작하는 기기
class Remocon{ //작동은 하지만 전자제품이 100개라면 이런식으로 100개 만들어야 함
	/*void turnOn(Tv target) {
		System.out.println("제품이 켜졌습니다.");
	}
	void turnOn(AirConditioner target) {
		System.out.println("제품이 켜졌습니다.");
	}*/
	
	
	//매개변수의 다형성을 이용하여 turnOn 메서드를 1개만 생성
	void turnOn(ElectronicProduct target) {
		if(target instanceof Tv) {
			System.out.print("Tv ");
		} else if(target instanceof AirConditioner) {
			System.out.print("에어컨 ");
		} else {
			System.out.println("전자 ");
		}
		System.out.println("제품이 켜졌습니다.");
	}
}

class ElectronicProduct{
	
}

class Tv extends ElectronicProduct{
	
}
class AirConditioner extends ElectronicProduct{
	
}
