package day05;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		// 1에서 9사이의 정수 5개를 입력받아 각 숫자가 몇개씩 입력됐는지 출력하는 코드
		int countList[] = new int[5];
		int tmpList[] = new int[9];
		int userNum;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~9사이의 정수 5개를 입력하시오 : ");
				
		for(int i=0; i<countList.length; i++) {
			userNum = scanner.nextInt();
			countList[i] = userNum;
		}
		
		for(int k=0; k<countList.length; k++) {
			for(int j=0; j<=7; j++) {
				if(countList[k] == j+1) {
					tmpList[j]++;
				}
			}
		}
		for(int i=0; i<tmpList.length; i++) {
			System.out.print((i+1) + " : " + tmpList[i] + "개");
			System.out.println();
		}
		scanner.close();
	}
}
