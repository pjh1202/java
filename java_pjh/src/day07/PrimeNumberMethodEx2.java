package day07;

public class PrimeNumberMethodEx2 {

	public static void main(String[] args) {
		// 주어진 num이 소수인지 아닌지 판별하는 코드(메서드 이용)
		//1에서 100사이의 소수 출력
		for(int i=1; i<=100; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				}
			}
		}						
	
	public static boolean isPrimeNumber(int num) {
		isDivior(num);
		if(isDivior(num)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isDivior(int num) {
		for(int i=2; i<num; i++) {
			if(num==1) {return false;}
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
