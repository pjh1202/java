package day13;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// 랜덤 예제
		Random random = new Random();//괄호안에 종자값을 넣으면 고정된 수가 나타나게 됨
		                             //넣지 않으면 현재시간을 기준으로 종자값을 생성함
		
		int min=1, max=9;
		for(int i=0; i<10; i++) {
			System.out.print(random.nextInt(max-min+1)+min+" ");
		}
	}
}
