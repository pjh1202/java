package day03;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤으로 생성된 숫자 이용해서 업다운 게임 1~100
		 */
		Scanner scanner = new Scanner(System.in);
		int min = 1, max = 100;
		int num = (int)(Math.random()*100);
		System.out.print("정수를 입력해서 맞춰보세요 : ");
		int result = scanner.nextInt();
		
		while(true) {
			if (result == num) {
				System.out.println("정답입니다.");
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
		System.out.println("게임 종료");
	}
}
