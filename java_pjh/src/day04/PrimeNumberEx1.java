package day04;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
		/*
		 * 2부터 100사이의 모든 소수 출력하는 코드 작성
		 * 약수가 2개인것만 출력
		 */
		int count=0;
		for(int i=2; i<=100; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
