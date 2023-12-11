package day02;

public class OperatorEx5 {
	//논리연산자 예제
	/*
	 * && : and 연산자, 모두 참이면 참 
	 * || : or 연산자, 하나라도 참이면 참
	 */
	public static void main(String[] args) {
		//성적이 올바른지 확인. 올바른 성적은 0이상 100이하
		int score = 90;
		
		System.out.println(score + "점은 올바른 성적인가? " + (score>=0 && score <=100));
		System.out.println(score + "점은 올바른 성적이 아닌가? " + !(score>=0 && score <=100));
		System.out.println(score + "점은 올바른 성적이 아닌가? " + (true != (score>=0 && score <=100)));
		
		
		
	}
}