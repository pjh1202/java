package day13;

import lombok.Data;

public class LombokEx1 {

	public static void main(String[] args) {
		//lombok 예제 getter setter 안만들고 @getter @setter만 붙여줘도 사용할 수 있게 됨
		Test t = new Test();
		t.print();
		t.setNum1(10);
		System.out.println(t.getNum1());
		System.out.println(t);
	}
}
@Data                //t 를 출력했을 때 해당 멤버변수를 조회할 수 있음 밑에 두 개도 포함되어 있음
  					 //getter setter 도 포함되어 있음
//@AllArgsConstructor  모든 멤버들이 매개변수로 들어간 생성자 생성
//@NoArgsConstructor   기본 생성자 추가
class Test {
	private int num1;
	private int num2;
	
	public void print() { 
		System.out.println(num1);
		System.out.println(num2);
	}
}