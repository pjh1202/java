package day02;

import java.util.Scanner;

public class ScannerEx1 {
	//Scanner 예제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력받은 정수 : "+ num1);
		
		System.out.print("한 단어를 입력하세요 : ");
		String str1 = scanner.next();
		System.out.println("입력받은 단어 : " + str1);
		
		System.out.print("실수를 입력하세요 : ");
		double num2 = scanner.nextDouble();
		System.out.println("입력받은 실수 : " + num2);
		
		System.out.print("한 문장을 입력하세요 : ");
		scanner.nextLine(); // 실수 다음에 입력한 엔터를 처리
		String str2 = scanner.nextLine();
		System.out.println("입력받은 문장 : " + str2);
		
		System.out.println("문자을 입력하세요 : ");
		char ch = scanner.next().charAt(0); //입력받은 문자열의 n번째 문자를 가져옴
		System.out.println("입력받은 문자 : " + ch);
		
		scanner.close();
	}

}
