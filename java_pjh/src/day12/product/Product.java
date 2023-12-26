package day12.product;

import java.util.Scanner;

public abstract class Product {
	public static Scanner scanner = new Scanner(System.in);
	//공통 : 브랜드, 제품코드, 제품명
	int count = 0;
	String brand, code, name;
	
	public static Product item[] = new Product[5];

	public Product(String brand, String code, String name) {
		this.brand = brand;
		this.code = code;
		this.name = name;
	}
	
	
	public abstract void print(); //자식클래스에서 오버라이드 할 것이기 때문에 추상메서드
	
}


