package day04;

import java.awt.Choice;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsEx {

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
				int player=-1;
				int computer = (int)(Math.random()*3);
				System.out.print("1. S \n2. R \n3. P \n: ");
				char play = scanner.next().charAt(0);
				if (play=='S') {
					player = 0;
				}
				else if (play == 'R') {
					player = 1;
				}
				else if (play == 'P') {
					player = 2;
				}
				else {
					System.out.println("잘못된 입력");
					continue;
				}
				
				if (computer == 0) {
					if(player==1) {
						System.out.println("com : 가위   vs   player : 바위");
						System.out.println("승리 !");
						win++;
					}
					if(player==2) {
						System.out.println("com : 가위   vs   player : 보");
						System.out.println("패배 !");
						lose++;
					}
				}
				if (computer == 1) {
					if(player == 0) {
						System.out.println("com : 바위   vs   player : 가위");
						System.out.println("패배 !");
						lose++;
					}
					if(player == 2) {
						System.out.println("com : 바위   vs   player : 보");
						System.out.println("승리 !");
						win++;
					}
				}
				
				if (computer == 2) {
					if(player == 0) {
						System.out.println("com : 보   vs   player : 가위");
						System.out.println("승리 !");
						win++;
					}
					if(player == 1) {
						System.out.println("com : 보   vs   player : 바위");
						System.out.println("패배 !");
						lose++;
					}
				}
				
				if(computer==player) {
					System.out.println("무승부 !");
					draw++;
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
