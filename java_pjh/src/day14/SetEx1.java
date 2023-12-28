package day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		//중복되지 않은 세 수를 저장하는 예제 : 1~9
		int min=1, max=9;
		
		//set은 중복된 수를 저장하지 않기 때문에 따로 코드를 작성하지 않아도 중복되지 않은 세 수를 입력할 수 있음
		while(set.size() < 3) {
			Random random = new Random();
			int tmp = random.nextInt(max-min+1)+min;
			set.add(tmp);
		}
		for(int i:set) {
			System.out.print(i+" ");
		}
	}
}
