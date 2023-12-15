package day06;

import java.util.Scanner;

public class ArithmeticEx2 {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임
		 */
		Scanner scanner = new Scanner(System.in);
		int max=99, min=1;
		int user, answer=0;
		int opNum = (int)(Math.random()*4);
		int randomNum1 = (int)(Math.random()*(max-min+1)+min);
		int randomNum2 = (int)(Math.random()*(max-min+1)+min);
		String str = "+-*";
		char op = str.charAt(opNum);
		
		System.out.println("" + randomNum1 + op + randomNum2 + "=");
		user=scanner.nextInt();
		//정답계산
		switch(op) {
		case '+' : answer = randomNum1 + randomNum2;	break;
		case '-' : answer = randomNum1 - randomNum2;	break;
		case '*' : answer = randomNum1 * randomNum2;	break;
		default : System.out.println("잘못된 연산자");
		}
		//맞췄는지 틀렸는지
		if(user == answer) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		scanner.close();
	}
}
