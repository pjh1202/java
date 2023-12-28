package day14;

import java.util.ArrayList;
import java.util.Scanner;

//속담을 입력받아 저장하고, 출력하는 코드
public class ListEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int count=0;
		while(true) {
			System.out.print("속담 입력 : ");
			String user = scanner.nextLine();
			if(user.equals("종료")) {
				break;
			}
			list.add(user);
			for(String tmp:list) {
				System.out.println(tmp);
			}
		}
	}
}
