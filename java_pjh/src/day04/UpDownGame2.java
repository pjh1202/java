package day04;

import java.util.Scanner;

public class UpDownGame2 {

	public static void main(String[] args) {

		// 메뉴 만들어서 up down 게임
		
		Scanner scanner = new Scanner(System.in);
		int menu, highScore=100;
		
		
		while(true) {
			System.out.println("----메뉴---- \n1. 새게임 \n2. 최고기록 확인 \n3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			switch (menu) {
			case 1: {
				int score=0;
				int num = (int)(Math.random()*100);
				System.out.print("정수를 입력해서 맞춰보세요 : ");
				System.out.println("정답 : " + num);
				int result = scanner.nextInt();
				
				while(true) {
					score++;
					if (result == num) {
						System.out.println("정답입니다.");
						if(score < highScore) {
							highScore = score;
						}
						break;
					}
					else if (result<num) {
						System.out.println("up");
						result = scanner.nextInt();
					}
					else {
						System.out.println("down");
						result = scanner.nextInt();
					}
				}
				continue;
			}
			case 2: {
				if(highScore == 100) {
					System.out.println("플레이한 기록이 없습니다.");
				}
				else {
				System.out.println("최고점수 : " + highScore);
				}
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
