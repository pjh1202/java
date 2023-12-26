package day12.product;

import java.util.Scanner;

/*
 * 제품을 추가하는 프로그램 작성
 * 제품은 TV, 에어컨, 컴퓨터만 추가 가능
 * 공통 : 브랜드, 제품코드, 제품명
 * TV : 화면크기
 * 에어컨 : 냉방면적
 * 노트북 : CPU, 램
 * 
 * TV클래스, 에어컨 클래스, 컴퓨터 클래스
 * Product 클래스
 * 
 * 메뉴
 * 1. 제품추가
 * 2. 제품확인
 * 3. 종료
 * 메뉴선택 : 1
 * 
 * 추가할 제품
 * 1. TV
 * 2. 에어컨
 * 3. 컴퓨터
 * 제품선택 : 1
 * 
 * 브랜드 : 삼성
 * 제품코드 : 123
 * 제품명 : 삼성 TV
 * 화면크기(cm) : 189
 * 
 * 등록이 완료됐습니다.
 * 
 * 제품선택 : 2(에어컨)
 * 브랜드 : 삼성
 * 제품코드 : 123
 * 제품명 : 삼성 에어컨
 * 냉방면적(m2) : 56.9 
 * 
 * 제품선택 : 3(노트북)
 * 브랜드 : 삼성
 * 제품코드 : 123
 * 제품명 : 삼성 노트북
 * 화면크기 : 20
 */
public class ProductMain {
	public static Scanner scanner = new Scanner(System.in);
	static Product [] list = new Product[30];
	static int count = 0;
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			run(menu);
		}while(menu!=3);
	}
	private static void run(int menu) {
		switch(menu) {
		case 1:
			insertProduct();
			break;
		case 2:
			printProduct();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("잘못된 메뉴선택");
			break;
		}
	}
	private static void insertProduct() {
		//제품목록 출력
		printProductTitle();
		//공통정보
		int select = scanner.nextInt();
		System.out.print("브랜드 : ");
		scanner.nextLine();
		String brand = scanner.nextLine();
		System.out.print("제품명 : ");
		String title = scanner.nextLine();
		System.out.print("제품코드 : ");
		String code = scanner.next();
		
		//제품마다 추가정보 입력 후 인스턴스 생성 후 추가
		switch(select) {
		case 1://TV
			System.out.print("화면크기 : ");
			int size = scanner.nextInt();
			list[count++] = new Tv(brand, code, title, size);
			break;
		case 2://에어컨
			System.out.print("냉방면적 : ");
			double area = scanner.nextDouble();
			list[count++] = new AirConditioner(brand, code, title, area);
			break;
		case 3://노트북
			System.out.print("CPU : ");
			double cpu = scanner.nextDouble();
			System.out.print("램 : ");
			int ram = scanner.nextInt();
			list[count++] = new Computer(brand, code, title, cpu, ram);
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
			return;
		}
		System.out.println("등록이 완료됐습니다.");
	}
	private static void printProductTitle() {
		System.out.println("1. TV");
		System.out.println("2. 에어컨");
		System.out.println("3. 노트북");
		System.out.print("메뉴선택 : ");
	}
	private static void printProduct() {
		if(count == 0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i=0; i<count; i++) {
			list[i].print();
		}
		
	}
	private static void printMenu() {
		System.out.println("---------------");
		System.out.println("--메뉴--");
		System.out.println("1. 제품추가");
		System.out.println("2. 제품확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
	}

}
