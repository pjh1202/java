package day05;

import java.util.Scanner;

public class ThirtyOneEx1 {

	public static void main(String[] args) {
		/*
		 * 사용자와 컴퓨터가 돌아가면서 최대 3개의 숫자를 불러서 31을 부르고, 
		 * 31을 입력한 사용자 또는 컴퓨터가 지는 게임
		 */

		Scanner scanner = new Scanner(System.in);
		int com=0, user, num=0, max=3, min=1;
		
		while(true) {
			System.out.println();
			System.out.print("부르고 싶은 수의 갯수를 쓰시오 : ");
			user = scanner.nextInt();
			com = 0;
			System.out.print("유저 : ");
			for(int i=0; i<user; i++) {
				num++;
				System.out.print(num + " ");
				}
			
			if(num>=31) {
				System.out.println("컴퓨터의 승리");
				break;
				}
			while(com==0) {
				com = (int)(Math.random()*((max-min+1)+min));
				}
			switch(com) {
			case 1: {
				num++;
				System.out.print("\n컴퓨터 : "+num+" ");
				break;
				}
			case 2: {
				System.out.print("\n컴퓨터 : ");
				for(int i=0; i<com; i++) {
						num++;
						System.out.print(num+" ");
						}
				System.out.println();
				break;
				}
			case 3: {
				System.out.print("\n컴퓨터 : ");
				for(int i=0; i<com; i++) {
						num++;
						System.out.print(num+" ");
						}
				System.out.println();
				break;
				}		
			}
			
			if(num>=31) {
				System.out.println("유저의 승리");
				break;
				}
			
			System.out.println();
			System.out.println("com : " + com);
			System.out.println("user : " + user);
			System.out.println("현재 숫자 : " + num);
			
		}	
	}
}
