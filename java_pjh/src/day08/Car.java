package day08;

public class Car {
	double weight;
	String brand;
	String category;
	String color;
	String carName;
	String [] tires;
	boolean power;
	int speed;
	boolean leftLight;
	boolean rightLight;
	int year;
	
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}
		else {
			System.out.println("시동이 꺼졌습니다.");
		}
		
	}
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	public void turnLight() {
		leftLight = true;
	}
	
}
