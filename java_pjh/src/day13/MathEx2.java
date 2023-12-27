package day13;

//import java.util.Scanner;

public class MathEx2 {

	public static void main(String[] args) {
		// 주어진 실수의 소수점 3자리에서 올림한 값을 출력하는 코드
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("소수점 3자리 이상 입력 : ");
		double num = scanner.nextDouble();
		double num2 =  Math.ceil(num*100);
		num = num2/100;
		System.out.println(num);*/
		
		//주어진 실수의 소수점 n자리에서 올림한 값을 출력하는 코드
		int n=5;
		double a = Math.pow(10, n-1);
		double num = 1.234567;
		double num2 =  Math.ceil(num*a);
		num = num2/(a);
		System.out.println(num);
	}
}
