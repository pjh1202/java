package day06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*
	 * 숫자 야구게임
	 * -1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서
	 *   해당 숫자를 맞추는 게임
	 * - S : 숫자가 있고, 위치가 같은 경우
	 * - B : 숫자만 맞고, 위치가 틀린 경우
	 * - O : 일치하는 숫자가 하나도 없는 경우
	 * 3S가 되면 게임이 종료됨
	 */
	Scanner scanner = new Scanner(System.in);
	int max=9,min=1;
	 //컴퓨터 숫자
	 //유저 숫자
	int count=0;
	int menu = 0;
	int score[] = new int[5];
	for(int i=0; i<score.length; i++) {
		score[i] = 100;
	}
	String scoreN[] = new String[5];
	while(true) {
		if(menu==3) {
			break;
		}
		System.out.print("1. 새게임\n2. 기록확인\n3. 프로그램 종료\n메뉴입력 : ");
		menu = scanner.nextInt();
			switch(menu) {
			case 1:{
				count = 0;
				int scoreCount = 0;
				int arr[] = new int[3];
				int user[] = new int[3];
				for(; count<3;) {
					int num = (int)(Math.random()*(max-min+1)+min);
					for(int i=0; i<arr.length; i++) {
						if(arr[i] == num) {
							break;
						}
						else if(arr[i] == 0) {
							arr[i] = num;
							count++;
							break;
						}
					}
				}
			while(true) {
				int arr2[] = new int[3];
				for(int i:arr) {
					System.out.print(i);
				}
				
				System.out.print("\n입력 : ");
				for(int i=0; i<user.length; i++) {
					user[i] = scanner.nextInt();
				}
				
				for(int i=0; i<arr.length; i++) {
					int outCount=0;
					for(int j=0; j<user.length; j++) {
						if(arr[i] == user[j]) {
							if(i==j) {
								arr2[0]++;
							}
							else {
								arr2[1]++;
							}
						}
						else {
							outCount++;
							if(outCount == 3) {
								arr2[2]++;
							}
						}
					}
				}
				
				System.out.print("결과 : ");
				for(int i=0; i<arr2.length; i++) {
					if(arr2[i] != 0) {
						switch(i) {
						case 0:{
							System.out.print(arr2[i] + "S" + " ");
							break;
							}
						case 1: {
							System.out.print(arr2[i] + "B" + " ");
							break;
							}
						case 2: {
							System.out.print(arr2[i] + "O" + " ");
							break;
							}
						}
					}
				}
				System.out.println();
				scoreCount++;
				if(arr2[0]==3) {
					System.out.println("정답입니다 !");
					for(int i=0; i<score.length; i++) {
						if(count < score[i]) {
							score[i] = scoreCount;
							System.out.print("현재 " + (i+1) + " 등입니다. 이름을 기록하세요 : ");
							scoreN[i] = scanner.next();
							break;
						}
					}
					break;
					}
				}
			break;
			}
			case 2: {
				System.out.println("--기록--");
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1)+"." + scoreN[i] + " : " + score[i]);
				}
				break;
				}
			case 3: {
				System.out.println("프로그램 종료");
				break;
				}
			}
		}
	}
}
