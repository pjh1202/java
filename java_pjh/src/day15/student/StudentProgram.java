package day15.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program {
	private List<Student> stdList = new ArrayList<Student>();
	private static Scanner scanner = new Scanner (System.in);
//학생관리, 성적관리, 조회, 프로그램 종료
	@Override
	public void printMenu() {
		System.out.println(stdList);
		System.out.println("---메뉴---");
		System.out.println("1. 학생관리");
		System.out.println("2. 성적관리");
		System.out.println("3. 조회");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void run() {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			runMenu(menu);
		}while(menu!=4);
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: studentSubMenu(); break;
		case 2: managerScore(); break;
		case 3: showList(); break;
		case 4: System.out.println("프로그램을 종료합니다."); break;
		default: System.out.println("잘못된 메뉴 선택"); break;
		}
		
	}

	private void studentSubMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.print("메뉴 선택 : ");
		int subMenu = scanner.nextInt();
		switch(subMenu) {
		case 1: addStudent(); break; //학생추가
		case 2: updateStudent(); break; //학생 수정
		case 3: deleteStudent(); break; //학생 삭제
		default: System.out.println("잘못된 메뉴 선택"); break;
		}
	}

	private void addStudent() {
		System.out.print("학년 : ");
		int grade = scanner.nextInt();
		System.out.print("반 : ");
		int classNum = scanner.nextInt();
		System.out.print("번호 : ");
		int num = scanner.nextInt();
		System.out.print("이름 : ");
		String name = scanner.next();
		Student std = new Student(grade, classNum, num, name);
		if(checkStudent(grade, classNum, num)) {
			System.out.println("중복된 정보의 학생이 존재합니다.");
			return;
		}
		stdList.add(std);
		System.out.println("학생 입력 완료");
	}

	private boolean checkStudent(int grade, int classNum, int num) {
		Student std = new Student(grade, classNum, num);
		if(stdList.contains(std)) {
			return true;
		}
		return false;
	}

	private void updateStudent() {
		System.out.print("수정할 학생의 이름 입력 : ");
		String name = scanner.next();
		Student std = new Student(name);
		if(stdList.contains(std)) {
			int tmp = stdList.indexOf(std);
			System.out.println("---" + name + " 학생 수정" + "---");
			System.out.print("수정할 학년 : ");
			int grade = scanner.nextInt();
			System.out.print("수정할 반 : ");
			int classNum = scanner.nextInt();
			System.out.print("수정할 번호 : ");
			int num = scanner.nextInt();
			System.out.print("수정할 이름 : ");
			String updateName = scanner.next();
			Student newStd = new Student(grade, classNum, num, updateName);
			if(checkStudent(grade, classNum, num)) {
				System.out.println("중복된 정보의 학생이 존재합니다.");
				return;
			}
			newStd.setKor(std.getKor());
			newStd.setEng(std.getEng());
			newStd.setMath(std.getMath());
			
			stdList.remove(tmp);
			stdList.add(newStd);
			System.out.println("학생 수정 완료");
		}
		
		else {
			System.out.println("입력하신 학생의 정보가 없습니다.");
		}
	}

	private void deleteStudent() {
		System.out.print("삭제할 학생의 이름 입력 : ");
		String name = scanner.next();
		Student std = new Student(name);
		int tmp = stdList.indexOf(std);
		if(tmp==-1) {
			System.out.println("입력하신 학생의 정보가 없습니다.");
		}
		else {
			System.out.println(stdList.remove(std)+" 학생의 정보가 삭제됐습니다.");
		}
	}

	private void managerScore() {
		System.out.print("관리할 학생의 학년, 반, 번호 입력 : ");
		int grade = scanner.nextInt();
		int classNum = scanner.nextInt();
		int num = scanner.nextInt();
		Student std = new Student(grade, classNum, num);
		int tmp = stdList.indexOf(std);
		if(checkStudent(grade, classNum, num)) {
			System.out.println("----관리할 성적----");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.print("메뉴 선택 : ");
			int menu1 = scanner.nextInt();
			switch(menu1) {
			case 1: System.out.print("현재 성적 : " + std.getKor()+"\n수정할 성적 : ");
			int kor = scanner.nextInt(); stdList.get(tmp).setKor(kor); break;
			case 2: System.out.print("현재 성적 : " + std.getEng()+"\n수정할 성적 : ");
			int eng = scanner.nextInt(); stdList.get(tmp).setKor(eng); break;
			case 3: System.out.print("현재 성적 : " + std.getMath()+"\n수정할 성적 : ");
			int math = scanner.nextInt(); stdList.get(tmp).setKor(math); break;
			default: System.out.println("잘못된 메뉴선택"); break;
			}
			System.out.println("완료됐습니다.");
		}
		else {
			System.out.println("입력하신 학생의 정보가 없습니다.");
			return;
		}
		
	}

	private void showList() {
		System.out.println("1. 학생 조회");
		System.out.println("2. 성적 조회");
		System.out.println("3. 개별 조회");
		System.out.print("메뉴 선택 : ");
		int subMenu = scanner.nextInt();
		switch(subMenu) {
		case 1: showStudent(); break; //학생조회 
		case 2: showScore(); break; //성적조회
		case 3: studentView(); break;
		default: System.out.println("잘못된 메뉴 선택"); break;
		}
	}

	private void studentView() {
		// TODO Auto-generated method stub
		
	}

	private void showStudent() {
		System.out.println("");
		
	}

	private void showScore() {
		
		
	}

}
