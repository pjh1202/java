package day02;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		// 점수를 입력받아서 0인지 양수인지 음수인지 판별하는 코드
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		if(num == 0) {
			System.out.println(num + "은 0입니다.");
		}
		else if(num > 0) {
			System.out.println(num + "은 양수입니다.");
		}
		else {
			System.out.println(num + "은 음수입니다.");
		}
		
		scanner.close();
	}

}
