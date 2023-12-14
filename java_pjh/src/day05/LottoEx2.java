package day05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		/*
		 * 로또당첨번호를 랜덤으로 생성한 후(당첨번호6자리 + 보너스번호),
		 * 사용자가 로또번호를 입력하면 당첨등수 출력 코드
		 */
		Scanner scanner = new Scanner(System.in);
		int lotto[] = new int[6];
		int max=45,min=1, num, count=0, userNum, num2=0, 
			lottoCountNum=8,bonus=0;
		
		while(count < lotto.length) {
			num = (int)(((max-min+1)+min)*Math.random());
			
			int i;
			for(i=0; i<count; i++) {
				if(lotto[i] == num && num != 0) {
					break;
				}
			}
			if(i == count) { 
				lotto[i] = num;
				count++;
			}
		}
		Arrays.sort(lotto);
		
		//보너스번호 생성 후 중복검사
		for(int i=0; i<lotto.length;) {
			num2 = (int)(((max-min+1)+min)*Math.random());
			if(lotto[i] == num2 && num2 != 0) {
				continue;
			}
			else {
				i++;
			}
		}
		
		//로또당첨번호 + 보너스 번호 출력
		for(int j=0; j<lotto.length; j++) {
			System.out.print(lotto[j] + " ");
		}
		System.out.println("보너스 번호 : " + num2);
		
		//사용자 로또번호 입력받고 비교
		System.out.print("로또번호를 입력하세요 : ");
		for(int k=0; k<lotto.length+1; k++) {
		userNum = scanner.nextInt();
		if(userNum == num2) {
			bonus++;
			lottoCountNum--;
		}
		for(int B:lotto) {
			if(B == userNum) {
				lottoCountNum--;
			}
		}
		}
		
		//총 결과 출력
		
		/*System.out.println("사용자의 등수는 : " + lottoCountNum + "등!");
		if(bonus == 0) {
			System.out.println("보너스 번호를 맞추지 못하셨습니다.");
		}
		else {
			System.out.println("보너스 번호를 맞추셨습니다.");
		}*/
		
		switch(lottoCountNum) {
		case 1: {
			if(bonus==1) {
				System.out.println("1등!");
			}
			else {
				System.out.println("2등!");
			}
			break;
		}
		case 2: {
			if(bonus==1) {
				System.out.println("3등!");
			}
			else {
				System.out.println("4등");
			}
			break;
		}
		case 3: {
			System.out.println("5등");
			break;
		}
		default: {
			System.out.println("꽝");
			break;
		}
		}
		
		scanner.close();
	}
}
