package day07;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램 작성
		 * --메뉴--
		 * 1. 새게임
		 * 2. 결과 조회
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 1
		 * ------------------
		 * 선택(홀:1, 짝:0) : 1
		 * 3 홀입니다.
		 * 성공!
		 * ------------------
		 * 메뉴 선택 : 2
		 * 결과 : 1승 0패
		 * ------------------
		 */
		Scanner scanner = new Scanner(System.in);
		int menu, winCount=0, loseCount=0;
		do {
			//메뉴선택 메서드
			menu();
			menu = scanner.nextInt();
			int user;
			switch (menu) {
			case 1: {
				System.out.println("--------------");
				System.out.print("선택(홀:1, 짝:0) : ");
				user = scanner.nextInt();
				if (user == 1 || user == 0) {
					if(newGame(user)) {
						System.out.println("승리 !");
						winCount++;
					}
					else {
						System.out.println("패배");
						loseCount++;
					}
				}
				else {
					System.out.println("잘못된 홀짝 입력");
				}
				break;	
				}
			case 2: {
				score(winCount, loseCount);
				break;
				}
			case 3 : {
				System.out.println("프로그램 종료");
				break;
				}
			default : {
				System.out.println("잘못된 메뉴선택");
				}
			}
		} while(menu != 3);
		scanner.close();
	}
	
	
	public static void menu() {
		System.out.print("----메뉴선택----\n1. 새게임\n2. 결과조회\n3. 프로그램 종료\n메뉴 선택 : ");
	}
	
	public static boolean newGame(int user) {
		int max=100, min=1;
		int com = (int)(Math.random()*(max-min+1)+min);
		System.out.println(com);
		if(com%2==0) {
			//짝수
			if(user == 1) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			//홀수
			if(user == 1) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public static int score(int winCount, int loseCount) {
		System.out.println("--------------");
		System.out.println("결과 : " + winCount + "승 " + loseCount + "패");
		return 0;
	}
}
