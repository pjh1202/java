package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		//map 예제
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "abc123!");
		map.put("def456", "abc123!");//벨류가 중복이므로 정상적으로 추가됨
		//map.put("abc123", "abc1234"); 키 값이 같으므로 추가가 안되고 기존의 키 값의 벨류값이 변경됨
		
		map.put("admin", "admin");
		map.put("def", "def");
		
		System.out.println(map.remove("abc123")); //해당 키값의 요소를 삭제하면서 벨류 값 리턴
		System.out.println(map); 
		
		//keySet을 이용한 반복문 예제
		Set<String> keySet = map.keySet();
		for(String tmp : keySet) {
			String value = map.get(tmp);
			System.out.print(value + " ");
		}
		
		//entrySet을 이용한 반복문 예제
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> tmp : entrySet) {
			System.out.print("["+tmp.getKey()+ "," +tmp.getValue()+"]");
		}
		
		//내부 클래스의 인스턴스를 생성하는 예제
		A a = new A();
		A.B b = a.new B();
	}

}

class Entry1<K,V>{
	K key;
	V value;
}

//class 안의 class (잘 안씀)
class A{
	public class B{ //B클래스가 A클래스를 이용해서만 만들어져야 하는 경우에 이렇게 만듬
		int num;
	}
}