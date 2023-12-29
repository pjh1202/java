package Project1.membership;

import java.util.ArrayList;
import java.util.Scanner;
//아이디 비밀번호 이메일 이름 생년월일 휴대폰번호 관리자 코드?
public class MembershipMain {
	static ArrayList<SearchInformation> memberList = new ArrayList<SearchInformation>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		printMenu();
		
	}
	private static void printMenu() {
		System.out.print("아이디 입력 : ");
		String id = scanner.next();
		System.out.print("비밀번호 입력 : ");
		String pw = scanner.next();
		System.out.println("비밀번호 확인 : ");
		String pw2 = scanner.next();
		if(pw2.equals(pw)) {System.out.println("비밀번호가 동일하지 않습니다."); return;}
		System.out.print("이메일 입력 : ");
		String email = scanner.next();
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.println("휴대폰 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.println("관리자 코드 : ");
		int managerCode = scanner.nextInt();
		
		SearchInformation searchInformation = new SearchInformation(id, pw, email, name, number, managerCode); 
		memberList.add(searchInformation);
		System.out.println("정상적으로 가입되었습니다.");
	}	
}
