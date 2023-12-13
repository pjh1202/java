package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 두 정수의 공약수를 출력하는 코드
		 */
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 약수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 약수 입력 : ");
		int num2 = scanner.nextInt();
		
		for(int i = 1; i<=num1; i++) {
			if(num1%i == 0 || num1 == i) {
				A.add(i);
			}
		}
		
		for(int i = 1; i<=num2; i++) {
			if(num2%i == 0 || num2 == i) {
				if (A.contains(i)) {
					B.add(i);
				}
			}
		}
		System.out.println("최대공약수 : " + Collections.max(B));
		scanner.close();
	}
}
