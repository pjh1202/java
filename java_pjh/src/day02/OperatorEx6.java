package day02;

public class OperatorEx6 {
	//조건 선택 연산자 예제
	public static void main(String[] args) {
		//성적이 A인지 아닌지를 판별하는 예제
		//성적이 100이하이고 90이상이면 A, 아니면 A가 아님
		int score = 90;
		
		String result = "";
		
		//score가 100이하, 90이상이면 
		//score <= 100 && score >= 90
		//변수 (비교연산자) (논리연산자) 변수 (비교연산자) ? 참일때 출력 : 거짓일 때 출력;
		
		result = score <= 100 && score >= 90 ? "A학점입니다." : "A학점이 아닙니다.";
		
		System.out.println(score + "점은 " + result);
		
		
		
	}

}
