package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		// 로또번호는 1~45사이의 랜덤한 수 6개생성하여 출력 
		// 정렬이 되도록
		int max=45,min=1;
		int lotto[] = new int[6];
		int num, count=0;
		
		while(count < lotto.length) {
			num = (int)(((max-min+1)+min)*Math.random());
			
			int i;
			for(i=0; i<count; i++) {
				if(lotto[i] == num) {
					break;
				}
			}
			if(i == count) { 
				lotto[i] = num;
				count++;
			}
		}
		Arrays.sort(lotto);
		for(int j=0; j<lotto.length; j++) {
			System.out.print(lotto[j] + " ");
		}
	}
}