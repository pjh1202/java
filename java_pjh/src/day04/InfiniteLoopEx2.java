package day04;

import java.util.Scanner;

public class InfiniteLoopEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		//조건식에 사용하는 변수가 증감하지 않아서 무한루프 발생하는 예제
		for(int i=10; i>0; ) {
			System.out.println("정수 입력 : ");
			num = scanner.nextInt();
			System.out.println("정수 출럭 : " + num);
		}
		//i에 따라 조건식 true로 될 수도 있기 때문에 에러가 발생하지 않음
		System.out.println("프로그램 종료");
		
		//위 코드와 다른점은 위에는 무한루프이고, 이 코드는 무수히 많이 실행되는 것
		//i가 계속 더해지다가 int의 범위를 벗어나서 오버플로우되면 멈춤
		for(int i=10; i>0; i++) {
			System.out.println("정수 입력 : ");
			num = scanner.nextInt();
			System.out.println("정수 출럭 : " + num);
		}
	}
}
