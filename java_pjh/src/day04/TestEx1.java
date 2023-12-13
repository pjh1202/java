package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/*
		 * Scanner를 이용하여 국어, 영어, 수학 성적을 입력받고,
		 * 총점과 평균을 구하는 문제
		 */

		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math, sum;
		double avg;
		
		System.out.print("국어 성적 입력 : ");
		kor = scanner.nextInt();
		System.out.print("수학 성적 입력 : ");
		eng = scanner.nextInt();
		System.out.print("영어 성적 입력 : ");
		math = scanner.nextInt();
		sum = kor+eng+math;
		avg=(double)sum/3;
		System.out.println("총점은 : "+ sum);
		System.out.println("평균은 : " + avg);
		scanner.close();
	}
}
