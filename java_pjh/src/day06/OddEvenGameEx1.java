package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		// 정수 num이 주어졌을 때 홀수인지 짝수인지 판별 예제
	//현재금액이 0이 될 때 까지 반복
	Scanner scanner = new Scanner(System.in);
	int max=100,min=1, com=0, user, totalMoney = 10000, userMoney; //게임 시작 자금;
	
	//num이 1~100사이의 랜덤한 수를 작성하는 코드 작성
	while(totalMoney > 0) {
		int num = (int)((Math.random()*(max-min+1)-min));
		//사용자가 게임에 투입할 금액을 입력하는 코드
		System.out.println("현재 가지고 있는 돈 : " + totalMoney);
		System.out.print("배팅할 금액 입력 : ");
		userMoney = scanner.nextInt();
		if(userMoney>totalMoney) {
			userMoney = totalMoney;
			}
		totalMoney -= userMoney;
		System.out.println("사용된 돈 : " + userMoney);
		System.out.println("남은 돈 : " + totalMoney);

		
		System.out.println(num);
		
		//사용자가 0또는 1을 입력받는 코드 작성
		while(true) {
			System.out.print("0 또는 1 입력 : ");
			user = scanner.nextInt();
			if(user == 0 || user == 1) {
				break;
				}
			else {
				System.out.println("잘못된 수 입력");
				}
			}
		
		if(num%2==0) {
			System.out.println("짝수");
			}
		else {
			System.out.println("홀수");
			com++;
			}		
		//사용자가 입력한 값이 맞았는지 틀렸는 지를 출력하는 코드
		
		//이기면 배팅금액의 2배, 패이면 배팅 금액 차감
		
		if(user==com) {
			System.out.println("정답 !");
			totalMoney += userMoney*2;
			}
		else {
			System.out.println("오답 !");
			userMoney = 0;
			}
		System.out.println("현재 가지고 있는 돈 : " + totalMoney);
		if(totalMoney<=0) {
			System.out.println("돈을 모두 잃었습니다.");
			}
		}
	scanner.close();
	}
}