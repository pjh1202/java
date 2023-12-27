package day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx2 {
	
	public static void main(String[] args) {
		/*
		 * 아이디를 입력받아 아이디 형식에 맞는지 틀린지 출력하는 프로그램
		 * 아이디 정규표현식 : 영문, 숫자로 구성되어있고, 8~13자
		 * 아이디 : 
		 * 
		 * 아이디 형식에 맞지 않습니다.
		 * 아이디로 사용 가능합니다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		String user = scanner.nextLine();
		String regex = "^[a-zA-Z0-9]{8,13}$"; // "\\w{8,13}" 자바에서는 그냥 \를 사용하려면 \\
		if(Pattern.matches(regex, user)) {
			System.out.println("아이디로 사용 가능합니다.");
		}
		else {
			System.out.println("아이디로 사용 불가능합니다.");
		}
	}

}
