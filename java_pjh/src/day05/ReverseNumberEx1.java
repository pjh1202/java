package day05;

import java.util.Scanner;

public class ReverseNumberEx1 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드
		// 입력 1234 출력 4321 입력 1200 출력 0021
		int arr[] = new int[10];
		int num,tmp=0,a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		num = scanner.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(tmp!=0) {
				num=tmp;
			}
			arr[i] = num % 10;
			tmp = num / 10;
			if(tmp == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.print("출력 : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				break;
			}
			System.out.print(arr[i] + " ");
		}
	}
}
