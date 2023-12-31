package day13;

import java.util.Scanner;

//Program 인터페이스를 구현한 구현 클래스
//인터페이스에는 추상메서드들이 존재하고 모든 메서드들을 반드시 구현해야 오류가 나지 않음
public class ConsoleProgram implements Program{
	private Scanner scanner = new Scanner(System.in);
	@Override
	public void printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 기능1");
		System.out.println("2. 기능2");
		System.out.println("3. 기능3");
		System.out.println("4. 종료");
		System.out.println("------------------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1: System.out.println("기능1이 실행중입니다."); break;
		case 2:System.out.println("기능2이 실행중입니다."); break;
		case 3:System.out.println("기능3이 실행중입니다."); break;
		case 4:System.out.println("프로그램 종료"); break;
		default:
			System.out.println("잘못된 메뉴 선택");
			break;
		}
	}

	@Override
	public void printExit() {
		System.out.println("프로그램을 종료합니다.");
		
	}

	@Override
	public void run() {
		System.out.println("------------------------");
		System.out.println("프로그램을 실행합니다.");
		int menu;
		do {
			printMenu();
			menu=scanner.nextInt();
			runMenu(menu);
		}while(menu != 4);
	}
	
}
