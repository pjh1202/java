package day03;

import java.util.Iterator;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/*
		 * 정수의 약수 출력
		 */
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scanner.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0 || num==i) {
				System.out.println(i);
			}
		}	
	}
}