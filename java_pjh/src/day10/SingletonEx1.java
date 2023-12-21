package day10;

public class SingletonEx1 {
/*
 * 지역변수 
 * 메서드에 선언된 변수
 * 선언된 범위{}안에서 사용 가능 벗어나면 불가능
 * 스택 메모리에 생성
 * 메서드 반환 시 메모리 공간이 해제됨
 * 
 * 멤버변수(전역변수)
 * 객체변수(인스턴스 변수)
 * 힘 메모리에 생성
 * 객체가 GC에 의해 수거될 때 해제 됨
 * 클래스 안에 있는 모든 객체 메서드, 생성자
 * 
 * 클래스 변수(static 붙은 거)
 * 프로그램 영역 중 데이터 영역(상수, 문자열, 클래스변수)에 생성
 * 프로그램이 종료될 때 해제
 * static 변수를 너무 크게 잡지 말자
 * 
 * 싱글톤
 * 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤이라고 함
 * 생성자를 private
 * 클래스 변수를 이용하여 인스턴스 생성
 * 
 * 
 */
	public static void main(String[] args) {
		//Singleton s = new Singleton(); //생성자가 있는데도 private이기 때문에 오류 뜸
		Singleton s = Singleton.getInstance();
		System.out.println(s.getSrt());
		s.setStr("abc");
		System.out.println(s.getSrt());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s.getSrt());//str의 초기값인 HI가 아니라 앞에서 수정한 abc가 출력됨
		
//이정도만 기억-->	//싱글톤 클래스의 인스턴스 s와 s2는 같은 인스턴스를 공유하기 때문에
		        //s2에서 값을 수정하면 s에서 변경된 값을 확인할 수 있음
		
		s2.setStr("def");
		System.out.println(s.getSrt());//
	}
}

class Singleton {
	//본인 클래스의 인스턴스를 static으로 선언
	private static Singleton singleton=new Singleton();
	private String str;
	
	private Singleton() { //보통 public인 생성자와 다르게 private임
		str = "Hi";
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	public String getSrt() {	
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}