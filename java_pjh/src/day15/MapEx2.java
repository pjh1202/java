package day15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx2 {
	// 회원을 관리하는 프로그램 작성
			/*
			 * 1. 회원가입
			 *  - 이미 가입된 회원인지 체크(containsKey)
			 *  - 아이디 비번 입력 받기
			 * 2. 회원검색
			 *  - 아이디 입력해서 정보조회
			 * 3. 종료
			 */
	private static Scanner scanner = new Scanner(System.in);
	private static Map<String, String> map = new HashMap<String, String>();
	public static void main(String[] args) {
		int menu=0;
		do {
		printMenu();
		try {menu = scanner.nextInt();runMenu(menu);}
		catch(InputMismatchException e){System.out.println("잘못된 메뉴입니다.");scanner.nextLine();}
		} while(menu!=3);
	}

	private static void printMenu() {
		System.out.println("---메뉴---");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원조회");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1: information(); break;
		case 2: showMember(); break;
		case 3: System.out.println("프로그램을 종료합니다."); break;
		default: throw new InputMismatchException();
		}
	}

	private static void information() {
		System.out.print("아이디 입력 : ");
		String id = scanner.next();
		if(map.containsKey(id)) {
			System.out.println("중복된 아이디입니다.");
			return;
			}
		System.out.print("비밀번호 입력 : ");
		String pw = scanner.next();
		map.put(id, pw);
		System.out.println("가입완료");
	}

	private static void showMember() {
		System.out.print("조회할 아이디 입력 : ");
		String id = scanner.next();
		if(map.containsKey(id)) {
			System.out.println("id : " + id+ "  pw : " + map.get(id));
		}
		else {
			System.out.println("아이디가 없습니다.");
			}
		}
	}
