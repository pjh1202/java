package day06;

import java.util.Scanner;

public class ScoreEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor[] = new int[31];
		int eng[] = new int[31];
		int math[] = new int[31];
		while(true) {
			System.out.print("---메뉴---\n1. 성적수정\n2. 성적조회\n3. 프로그램 종료\n메뉴선택 : ");
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1: {
				System.out.print("1. 국어\n2. 영어\n3. 수학\n과목선택 : ");
				int choice = scanner.nextInt();
				System.out.print("학생선택 : ");
				int student = scanner.nextInt();
				System.out.print("성적 수정 : ");
				int score = scanner.nextInt();
				switch(choice) {
				case 1: {
					kor[student] = score;
					break;
					}
				case 2: {
					eng[student] = score;
					break;
					}
				case 3: {
					math[student] = score;
					break;
					}
				}
				continue;
				}
			
			
			case 2: {
				System.out.print("1. 과목별 조회\n2. 학생별 조회\n 선택 : ");
				int user = scanner.nextInt();
				if (user==1) {
					System.out.print("1. 국어\n2. 영어\n3. 수학\n과목선택 : ");
					int choice = scanner.nextInt();
					switch(choice) {
					case 1: {
						for(int i=1; i<kor.length;i++) {
							System.out.println(i+"번" +" : "+ kor[i] + "점");
							}
						break;
						}
					case 2: {
						for(int i=1; i<eng.length;i++) {
							System.out.println(i+"번" +" : "+ eng[i] + "점");
							}
						break;
						}
					case 3: {
						for(int i=1; i<math.length;i++) {
							System.out.println(i+"번" +" : "+ math[i] + "점");
							}
						break;
						}
					}
				}
				
				else if(user==2) {
					System.out.print("학생선택 : ");
					int student = scanner.nextInt();
					System.out.println("국어 : " + kor[student] + "\n영어 : " + 
					eng[student] + "\n수학 : " + math[student]);
				}
				else {
					System.out.println("잘못된 메뉴 입력");
				}
				continue;
			}
			case 3: {
				System.out.println("프로그램 종료");
				break;
				}
			}
			if(menu == 3) {
				break;
			}
		}
	}
}
