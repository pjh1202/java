package day03;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		//문자를 입력받아 입력받은 문자를 출력하고, q를 입력하면 종료하는 예제
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char word = scanner.next().charAt(0);
		
		if(word == 'q') {
			System.out.println("종료.");
		}
		else {
			System.out.println("입력하신 문자는 : "+word);
		}

	}

}
