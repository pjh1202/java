package day06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임
		 */
		Scanner scanner = new Scanner(System.in);
		int max=99, min=1;
		
		while(true) {
			int com = (int)(Math.random()*4);
			int randomNum1 = (int)(Math.random()*(max-min+1)+min);
			int randomNum2 = (int)(Math.random()*(max-min+1)+min);
			
			switch(com) {
			case 0: {
				System.out.print(randomNum1 + "+" + randomNum2 + "= ");
				int result = scanner.nextInt();
				int comResult = randomNum1 + randomNum2;
				if(result == comResult) {
					System.out.println("정답");
				}
				else {
					System.out.println("오답");
				}
				continue;
			}
			case 1: {
				System.out.print(randomNum1 + "-" + randomNum2 + "= ");
				int result = scanner.nextInt();
				int comResult = randomNum1 - randomNum2;
				if(result == comResult) {
					System.out.println("정답");
				}
				else {
					System.out.println("오답");
				}
				continue;
			}
			case 2: {
				System.out.print(randomNum1 + "*" + randomNum2 + "= ");
				int result = scanner.nextInt();
				int comResult = randomNum1 * randomNum2;
				if(result == comResult) {
					System.out.println("정답");
				}
				else {
					System.out.println("오답");
				}
				continue;
				}
			}
		}
	}
}
