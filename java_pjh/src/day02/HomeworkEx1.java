package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*
		 * 성적을 입력받아서 성적에 맞는 학점을 출력하는 코드
		 * 90이상 A
		 * 80이상 90미만 B
		 * C D F
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("잘못된 점수");
		}
		else if (score >= 90 && score<=100) {
			System.out.println("A 학점입니다.");
		}
		else if (score >= 80 && score<90) {
			System.out.println("B 학점입니다.");
		}
		else if (score >= 70 && score<80) {
			System.out.println("C 학점입니다.");
		}
		else if (score >= 60 && score<70) {
			System.out.println("D 학점입니다.");
		}
		else {
			System.out.println("F 학점입니다.");
		}
	}
}
