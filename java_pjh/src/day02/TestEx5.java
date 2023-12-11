package day02;
import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		/*
		 * 월을 입력받아 입력받은 월의 계절을 출력
		 * 345 봄
		 * 678여름
		 * 9 10 11가을
		 * 12 1 2 겨울
		 * 그 외 잘못된 월
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = scanner.nextInt();
		if (month<=0 || month>12) {
			System.out.println("잘못된 월");
		}
		else if(month>=3 && month<=5) {
			System.out.println("봄");
		}
		else if(month>=6 && month<=8) {
			System.out.println("여름");
		}
		else if(month>=9 && month<=11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
		scanner.close();
	}
}