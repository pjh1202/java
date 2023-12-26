package day12.product;

public class AirConditioner extends Product {
	double area;

	public AirConditioner(String brand, String code, String name, double area) {
		super(brand, code, name);
		this.area = area;
	}

	@Override
	public void print() {
		// 부모클래스의 추상메서드이기 때문에 반드시 오버라이드해야함
		System.out.println("---------------");
		System.out.println("브랜드 : " + brand);
		System.out.println("제품명 : " + name);
		System.out.println("제품코드 : " + code);
		System.out.println("냉방면적 : " + area + "m2");
	}

}
