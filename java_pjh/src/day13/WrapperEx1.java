package day13;

public class WrapperEx1 {
	//Wrapper클래스는 null값 저장 가능
	public static void main(String[] args) {
		int num1=1;
		Integer num2 = 1;
		num2=null;
		num2=num1;
		System.out.println(num2);
		num2=20;
		num1=num2;
		System.out.println(num1);
		
		//num2는 wrapper클래스이기 때문에 null값을 저장할 수 있지만 num1은 아니기 때문에 오류뜸
		/*num2=null;
		num1 = num2;
		System.out.println(num1);*/
		
		//문자열을 정수로 만들기
		String str = "12345";
		int num3 = Integer.parseInt(str);
		System.out.println(num3);
		
	}
}
