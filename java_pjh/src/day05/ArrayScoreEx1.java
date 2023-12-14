package day05;

import java.util.Scanner;

public class ArrayScoreEx1 {

	public static void main(String[] args) {
		/*
		 * 학생 5명의 국어 성적을 입력받고, 총점과 평균을 구하는 코드 작성
		 */

		int kor[] = new int[5];
		int sum = 0;
		double avg;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.print(i+1 + "번째 학생 성적 : ");
			kor[i] = scanner.nextInt();
		}
		for(int j=0; j<kor.length; j++) {
			sum += kor[j];
		}
		avg = (double)sum/kor.length;
		System.out.println("총점 : " + sum + "\n평균 : " + avg);
		
		scanner.close();
	}
}