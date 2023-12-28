package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		//업캐스팅
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(1);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) { //hasNext : 다음요소가 있는지 살펴보고 다음요소를 가져와서 활용
			Integer tmp = it.next();
			System.out.println(tmp);
		}
	}
}
