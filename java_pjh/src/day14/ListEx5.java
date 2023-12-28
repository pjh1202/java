package day14;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;

public class ListEx5 {

	public static void main(String[] args) {
		/* contains와 indexOF는 A 클래스의 equals를 이용하여 두 인스턴스가 같은지 다른지를 비교
		 * 일반적으로 클래스에 equals를 오버라이딩 하는 것이 좋다.*/
		List<A> list = new ArrayList<A>();
		list.add(new A(1));
		list.add(new A(10));
		
		System.out.println(list.indexOf(new A(1)));
		
	}

}
@EqualsAndHashCode //이걸 붙어야 같다고 인식함
class A{
	private int num;
	
	public void print() {
		System.out.println(num);
	}
	public A(int num) {
		this.num = num;
	}
}
/* 리스트는 equals를 이용하나 하나씩 비교
   해쉬셋은 비교할 때 Hashcode를 먼저 비교하고
   hashcode가 같으면 equals를 이용해서 비교
   해쉬셋이 검색이 조금 더 빠름 */