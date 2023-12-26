package day12.product;

class Computer extends Product {
	double cpu;
	int ram;
	public Computer(String brand, String code, String name, double cpu, int ram) {
		super(brand, code, name);
		this.cpu = cpu;
		this.ram = ram;
	}
	@Override
	public void print() {
		// 부모클래스의 추상메서드이기 때문에 반드시 오버라이드해야함
		System.out.println("---------------");
		System.out.println("브랜드 : " + brand);
		System.out.println("제품명 : " + name);
		System.out.println("제품코드 : " + code);
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("램 : " + ram + "G");
	}

}
