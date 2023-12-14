package day05;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열 예제 학생 5명의 국어 성적 저장하기 위한 배열
		//배열의 범위를 벗어난 값을 원하면 에러뜸
		int kor[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.print(i+1 + "번째 학생 성적 : ");
			kor[i] = scanner.nextInt();
		}
		System.out.print("배열 출력 : ");
		for(int j=0; j<kor.length; j++) {
			System.out.print(kor[j]+" ");
		}
		scanner.close();
	}
}