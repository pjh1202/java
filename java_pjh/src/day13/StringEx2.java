package day13;

import java.util.Scanner;
/*
 * 문장들을 입력받아 배열에 저장하고, 특정 단어가 들어가 있는 문장들을 
 * 출력하는 프로그램을 작성
 * 
 * 메뉴
 * 1. 문장 추가
 * 2. 검색
 * 3. 종료
 * 
 * 안녕하세요.
 * 테스트
 * 만나서 반갑습니다.
 * 나는 홍길동입니다.
 * '나'로 검색하면
 * 만나서 반갑습니다, 나는 홍길동입니다.
 * 이 두개가 출력되게
 */
public class StringEx2 {
	private static Scanner scanner = new Scanner(System.in);
	static int count;
	static String strList[] = new String[3];
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			runMenu(menu);
		}while(menu!=3);
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1: insertStr(); break;
		case 2: searchStr(); break;
		case 3: System.out.println("프로그램 종료"); break;
		default: System.out.println("잘못된 메뉴 선택"); break;
		}
	}
	private static void insertStr() {
		System.out.print("추가할 문장 입력 : ");
		scanner.nextLine();
		if(strList.length<=count) {
			String tmp[] = new String[strList.length+5];
			System.arraycopy(strList, 0, tmp, 0, count);
			strList=tmp;
		}
		strList[count++] = scanner.nextLine();
	}
	private static void searchStr() {
		int tmp=0;
		System.out.println("검색할 문장을 입력하세요 : ");
		scanner.nextLine();
		String user = scanner.nextLine();
		for(int i=0; i<count; i++) {
			if(strList[i].contains(user)) {
				tmp++;
				System.out.println(strList[i]);
			}
		}
		if(tmp==0) {
			System.out.println("검색 결과 없음");
		}
	}
	private static void printMenu() {
		System.out.println("--메뉴--");
		System.out.println("1. 문장 추가");
		System.out.println("2. 문장 검색");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
}
