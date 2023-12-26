package day11.homework1;

import java.util.Scanner;

public class HomeWorkEx1 {
	/*
	 * 학생 성적 관리 프로그램
	 * 1. 학생 관리
	 *  - 학생 추가 : 동일한 학생(학년, 반, 번호가 같은)이 있으면 안됨
	 *  - 학생 삭제
	 * 2. 성적 관리
	 *  1) 성적 관리 
	 *    - 성적 추가 : 학생을 고르고 과목과 점수 입력
	 *    - 성적 수정 
	 *    - 성적 삭제
	 *  2) 학생 성적 관리
	 *    - 학생 성적 조회
	 *    - 학생 성적 추가
	 *    - 학생 성적 변경
	 *    - 학생 성적 삭제
	 * 3. 프로그램 종료
	 * 
	 * student 클래스
	 * subject 클래스
	 *  - 쉬운 버전 : 과목명, 총점
	 *  - 과목명, 성적(중간, 기말, 수행평가, 총점) <--추가사항
	 */
	private static Scanner scanner = new Scanner(System.in);
	static int count=0;
	static int subjectCount=0;
	private static Student student[] = new Student[5];
	private static Subject subjectList[] = new Subject[5];
			
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			run(menu);
		}while(menu!=3);
	}
	private static void run(int menu) {
		switch(menu) {
		case 1:
			management();
			break;
		case 2:
			Management();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
			break;
		}
		
	}
	private static void management() {
		//학생관리
		subMenu();
		int subMenu = scanner.nextInt();
		switch(subMenu) {
		case 1:
			studentAdd();
			break;
		case 2:
			studentDelete();
			break;
		default:
			System.out.println("잘못된 메뉴 선택");
			break;
		}
	}
	
	private static boolean searchStudent(int year, int group, int number, String name) {
		for(int i=0; i<count; i++) {
			if(name.equals(student[i].getName()) && year==student[i].year&& number==student[i].number&& group==student[i].group) {
				return true;
			}
		}
		return false;
	}
	
	private static void showScore() {
		// 성적조회
		System.out.println("조회하려는 학생의 학년 반 번호 이름을 순서대로 입력해주세요 : ");
		int year = scanner.nextInt();
		int group = scanner.nextInt();
		int number = scanner.nextInt();
		String name = scanner.next();
		
		if(searchStudent(year, group, number, name)) {
			//선택한 학생의 성적 출력
		}
	}
	
	private static void studentDelete() {
		System.out.print("삭제하려는 학생의 학년 반 번호 이름을 순서대로 입력해주세요\n : ");
		int year = scanner.nextInt();
		int group = scanner.nextInt();
		int number = scanner.nextInt();
		String name = scanner.next();
		
		if(searchStudent(year, group, number, name)) {
			System.out.println("같은 학년, 반, 번호, 이름의 학생이 있습니다.");
			return;
		}
	}
	private static void studentAdd() {
		System.out.print("학년을 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.print("반을 입력하세요 : ");
		int group = scanner.nextInt();
		System.out.print("번호를 입력하세요 : ");
		int number = scanner.nextInt();
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		
		if(searchStudent(year, group, number, name)) {
			System.out.println("같은 학년, 반, 번호, 이름의 학생이 있습니다.");
			return;
		}
		
		Student std = new Student(name, number, group, year);
		student[count++] = std;
	}
	private static void subMenu() {
		System.out.println("1. 학생추가");
		System.out.println("2. 학생삭제");
		System.out.print("메뉴 선택 : ");
	}
	private static void Management() {
		printSubMenu();		
		int menu = scanner.nextInt();
		switch(menu) {
		case 1:
			//성적 자체 관리
			scoreManagement();
			break;
		case 2:
			//학생 성적 관리
			studentScoreManagement();
			break;
		default:
			System.out.println("잘못된 메뉴 선택");
			break;
		}
	}
	private static void studentScoreManagement() {
		// 학생 성적 관리
		
	}
	private static void scoreManagement() {
		//성적 자체 관리
		printScoreMenu();
		int menu = scanner.nextInt();
		switch(menu) {
		case 1: addScore(); break;
		case 2: updateScore(); break;
		case 3: deleteScore(); break;
		default: System.out.println("잘못된 메뉴 선택"); break;
		}
		
	}
	private static void deleteScore() {
		// TODO Auto-generated method stub
		
	}
	private static void updateScore() {
		System.out.print("수정할 과목을 입력해주세요 : ");
		String subject = scanner.next();
		for(int i=0; i<subjectList.length;i++) {
			if(subject.equals(subjectList[i].getSubject())) {
				
			}
		}
	}
	private static void addScore() {
		System.out.print("추가할 과목을 입력해주세요 : ");
		String subject = scanner.next();
		//기본값 0
		Subject sjt = new Subject(subject,0);
		subjectList[subjectCount++] = sjt;
		
	}
	private static void printScoreMenu() {
		System.out.println("1. 성적 추가");
		System.out.println("2. 성적 수정");
		System.out.println("1. 성적 삭제");
		System.out.print("메뉴 선택 : ");
	}
	private static void printSubMenu() {
		System.out.println("1. 성적 관리");
		System.out.println("2. 학생 성적 관리");
		System.out.print("메뉴 선택 : ");
	}
	private static void printMenu() {
		System.out.println("---학생 성적 관리 프로그램---");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
	}
	
}
