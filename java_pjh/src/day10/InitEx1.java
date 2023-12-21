package day10;

public class InitEx1 {

	public static void main(String[] args) {
		B b = new B();
		//num1은 int의 기본값으로 초기화
		System.out.println(b.num1);
		//num2도 int의 기본값으로 초기화
		System.out.println(B.num2);
		//num3은 int의 기본값으로 초기화 -> 명시적 초기화로 덮어씀
		System.out.println(b.num3);
		//num4 int의 기본값으로 초기화 -> 명시적 초기화로 덮어씀
		System.out.println(B.num4);
		//num5 기본값 0 -> 명시적 초기화 10 -> 초기화 블록 3
		System.out.println(b.num5);
		//num6 기본값 0 -> 명시적 초기화 20 -> 초기화 블록 4
		System.out.println(B.num6);
		//num7 기본값 0 -> 명시적 초기화 30 -> 초기화 블록 500 -> 생성자 5
		System.out.println(b.num7);

	}

}
class B{
	int num1;
	static int num2;
	int num5 = 10;
	int num7 = 30;
	{                    //중괄호 열고 닫는게 초기화 블럭
		num5 = 3;
		num7 = 500;
	}
	int num3 = 1;
	static int num4 = 2;
	static int num6 = 20;
	static {
		num6 = 4;
	}
	public B() {
		num7 = 5;
	}
}


