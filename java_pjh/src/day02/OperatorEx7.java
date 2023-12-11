package day02;

public class OperatorEx7 {
	//비트연산자 예제, 비트 이동 연산자
	// & : 둘다 1이어야 1
	// | : 하나만 1이어도 1
	// ~ : 
	// ^ : 
	// <<, >>
	public static void main(String[] args) {
		
		int A = 4;
		int b = A>>1;//왼쪽 수를 2진수로 바꿔서 오른쪽 수만큼 민다.
		int c = A<<2;
		System.out.println(b);
		System.out.println(c);
	}
}