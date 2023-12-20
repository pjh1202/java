package day09Ex;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch문 안에 지역 변수를 선언하는 경우 발생할 수 있는 문제점
		
		for(int i=0; i<5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//i라는 변수를 각각 써도 상관없음
		
		int menu=2;
		int num;
		switch (menu) {
		case 1: 
			num = 10;
			System.out.println(num);
			break;
		case 2:
		  //int num = 20;    <-- 중복된 지역변수 오류 뜸 break가 없으면 이미 선언한 변수를 중복선언하는
			              //     것이 될 수도 있기 때문에 오류 따라서 스위치문 밖에서 선언
			num = 20;
			System.out.println(num);
			break;
		default:
			
		}
	}

}
