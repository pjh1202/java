package day04;

import java.util.Scanner;

public class DDD {

	public static void main(String[] args) {

		/*
		 * 가위, 바위, 보 게임 프로그램
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * 새게임 : 컴퓨터가 랜덤으로 내는 가위 바위 보와 내가 입력한 가위 바위 보를
		 *  	   비교하여 이기면 승, 지면 패, 비기면 무
		 *         가위0 바위1 보2
		 *         
		 * 기록 : 승, 무, 패 순서대로 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		int menu;
		int win=0, lose=0, draw=0;
		
		while(true) {
			System.out.println("----메뉴---- \n1. 새게임 \n2. 기록 확인 \n3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			switch (menu) {
			case 1: {
				char com;
				int computer = (int)(Math.random()*3);
				System.out.print("1. S \n2. R \n3. P \n: ");
				char player = scanner.next().charAt(0);
				if (computer==0) {
					com = 'S';
				}
				else if (computer==1) {
					com = 'R';
				}
				else {
					com = 'P';
				}
				
				if (player == com) {
					System.out.println("컴퓨터 : " + com + "   vs   플레이어 : " + player);
					System.out.println("무승부");
					draw++;
				}
				else if((player == 'S' && com == 'P') || (player == 'R' && com == 'S') || (player == 'P' && com == 'R')) {
				System.out.println("컴퓨터 : " + com + "   vs   플레이어 : " + player);
				System.out.println("승리 !");
				win++;
				}
				else {
				System.out.println("컴퓨터 : " + com + "   vs   플레이어 : " + player);
				System.out.println("패배 !");
				lose++;
				}
				continue;
			}
			case 2: {
				System.out.println("승 : " + win + "   무 : " + draw + "   패 : " + lose);
				continue;
			}
			case 3: {
				System.out.println("프로그램 종료");
				break;
				}
			}
			break;
		}
	}
}
