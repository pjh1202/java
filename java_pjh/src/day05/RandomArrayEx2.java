package day05;

import java.util.Arrays;

public class RandomArrayEx2 {

	public static void main(String[] args) {
		// 1에서 9사이의 중복되지 않은 랜덤한 수 3개 저장하는 예제
		
		int num,max=9,min=1;
		int randomList[] = new int[3];
		int randomCount = 0;
		 //배열에 저장된 중복되지 않는 수의 개수
		
		for(int count=0; count<randomList.length;) {
			num = (int)(Math.random()*(max-min+1)+min);
			for(int i=0; i<randomList.length; i++) {
				if(randomList[i] == num) {
					break;
				}
				else if(randomList[i] == 0) {
					randomList[i] = num;
					count++;
					break;
				}
			}
		}
		
		Arrays.sort(randomList);
		for(int i=0; i<randomList.length; i++) {
			System.out.print(randomList[i] + " ");
		}
	}
}
