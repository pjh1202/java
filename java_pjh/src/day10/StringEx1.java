package day10;

public class StringEx1 {

	public static void main(String[] args) {
		//문자열 비교 예제
		String str1 = "abc"; //데이터 영역에 abc추가, 추가된 주소를 가져와서 str1에 저장
		String str2 = "abc"; //데이터 영역에 abc가 있는지 확인, 있으니까 주소를 가져와서 str2에 연결함
		//결과적으로 str1과 str2가 주소를 공유
		
		//생성된 문자열 인스턴스의 주소를 str3에 저장
		String str3 = new String("abc");
		
		String str4 = new String("abc");
		
		//참조변수에서 ==은 주소를 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
		//문자열은 equals라는 메서드틀 통해 비교
	}

}
