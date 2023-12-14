package day05;

import java.util.Arrays;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		// 1~9 사이의 랜덤한 수 3개를 생성해서 배열에 저장하는 코드
		//3개짜리 배열 생성 후 랜덤한 수 저장
		int num,max=9,min=1;
		int randomList[] = new int[3];
		for(int i=0; i<randomList.length; i++) {
			num = (int)(((max-min+1)+min)*Math.random());
			randomList[i] = num;
		}
		Arrays.sort(randomList);
		for(int i=0; i<randomList.length; i++) {
			System.out.print(randomList[i] + " ");
		}
	}
}