package day04;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		/*
		 * 반드시 한번은 실행해야 하는 경우 사용
		 *  메뉴 출력 예제
		 *  메뉴
		 *  1. 새게임
		 *  2. 최고기록 확인
		 *  3. 프로그램 종료
		 *  메뉴 선택 : 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("메뉴 \n1. 새게임 \n2. 최고기록 확인 \n3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
		} while(menu!=3); {
			System.out.println("프로그램 종료");
		}
	}
}
