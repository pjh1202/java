package day02;

public class IfElseIfEx1 {
	//if else if문 예제
	public static void main(String[] args) {
		int num = 3;
		//num이 0이면 0출력, 양수이면 양수, 음수이면 음수
		
		if(num == 0) {
			System.out.println(num + "은 0입니다. ");
		}
		else if (num > 0) {
			System.out.println(num + "은 양수입니다.");
		}
		else {
			System.out.println(num + "은 음수입니다.");
		}

	}

}
