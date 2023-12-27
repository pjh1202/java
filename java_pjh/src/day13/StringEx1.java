package day13;

public class StringEx1 {

	public static void main(String[] args) {
		// String 클래스 예제
		String str = "abcde";
		
		//0번지에 있는 문자 반환
		System.out.println(str.charAt(0));
		
		//==연산자와는 다름, 두 문자열이 같은지 반환 true false
		System.out.println(str.equals("abc"));
		System.out.println(str.equals("abcde"));
		
		//cd라는 문자열이 있으면 시작번지반환
		System.out.println(str.indexOf("cd"));
		
		//cd라는 문자열이 있으면 true 없으면 false
		System.out.println(str.contains("cd"));
		
		//문자열의 길이를 반환
		System.out.println(str.length());
		
		//문자열을 바꿔서 새 문자열을 반환
		String str2 = str.replace("cd", "aa");
		//기존 문자열은 안 바뀜
		System.out.println(str);
		System.out.println(str2);
		
		//부분 문자열을 반환 1번지 부터 3번지 앞까지(2번지 까지) 뒤에 수가 없으면 시작번지부터 끝까지 반환함
		String str3 = str.substring(1,3);
		//기존 문자열은 안 바뀜
		System.out.println(str);
		System.out.println(str3);
		
		//대문자로
		String str4 = str.toUpperCase();
		System.out.println(str);
		System.out.println(str4);
		
		//소문자로
		String str5 = str4.toLowerCase();
		System.out.println(str4);
		System.out.println(str5);
		//둘 다 원본은 안 바뀜
		
		//시작문자 앞의 공백을 제거, 마지막 문자 뒤의 공백을 제거
		String str6 = "\n\nabc\tdef\t\t";
		System.out.println(str6);
		String str7 = str6.trim();
		System.out.println(str7);
		
		//문자열에서 문자열들을 추출해서 배열로 만들어 줌
		String fruits = "사과,배,오렌지";
		String fruitArray[] = fruits.split(",");
		System.out.println(fruits);
		for(String i:fruitArray) {
			System.out.println(i);
		}
	}
}
