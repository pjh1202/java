package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoEx2 {

	public static void main(String[] args) {
		//랜덤으로 당첨 번호를 생성하고, 사용자가 로또번호를 입력하면 등수를 알려주는 코드
		//컬렉션 이용
		//당첨번호 6개 보너스 1개 
		//사용자 6개
		
		Scanner scanner = new Scanner(System.in);
		int bonusCount=0, count = 0, bonus = 0;
		Set<Integer> set = new HashSet<Integer>();
		int max = 45, min = 1;
		
		while(set.size() < 7) {
		Random random = new Random();
		int tmp = random.nextInt(max-min+1)+min;
		set.add(tmp);
		}
		
		List<Integer> lotto2 = new ArrayList<Integer>();
		lotto2.addAll(set);
		bonus = lotto2.remove(lotto2.size()-1);
		System.out.println("bonus : " + bonus);
		System.out.println(lotto2);
		System.out.print("로또번호 6개를 입력하세요 : ");
		int user;
		for(int i=0; i<6; i++) {
			user = scanner.nextInt();
			if(user == bonus) {
				bonusCount++;
				count++;
				continue;
			}
			if(lotto2.contains(user)) {
				count++;
			}
		}	
		
		switch(count) {
		case 0: System.out.println("꽝"); break;
		case 1: System.out.println("꽝"); break;
		case 2: System.out.println("꽝"); break;
		case 3: System.out.println("5등"); break;
		case 4: System.out.println("4등"); break;
		case 5: if(bonusCount == 0) {
			System.out.println("3등");
		}
		else {
			System.out.println("2등");
		} break;
		case 6: System.out.println("1등"); break;
		}
	}
}
