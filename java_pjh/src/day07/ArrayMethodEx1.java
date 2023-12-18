package day07;

import java.util.Arrays;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		// 1에서 45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드 작성(메서드 이용해서)
		for(int i:random()) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] random() {
		
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
		return lotto;
	}
}
