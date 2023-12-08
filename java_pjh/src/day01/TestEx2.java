package day01;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		
		int language, english, math, sum;
		double average;
		
		Scanner scanner = new Scanner(System.in);
		language = scanner.nextInt();
		english = scanner.nextInt();
		math = scanner.nextInt();
		
		sum = language + english + math;
		average = sum/3;
		System.out.println("국어 수학 영어의 평균은 : "+ average);

	}

}
