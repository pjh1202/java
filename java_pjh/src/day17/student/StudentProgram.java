package day17.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Program.Program;

public class StudentProgram implements Program {
	
	private StudentManager sm = new StudentManager();
	private Scanner scanner = new Scanner(System.in);
	private final int EXIT = 3;
	@Override
	public void run() {
		int menu = 0;
		
		String fileName = "src/day17/student/student.txt";
		//불러오기
		load(fileName);
		do {
			printMenu();
			try {
				menu = scanner.nextInt();
				runMenu(menu);
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				scanner.nextLine();
			}
		}while(menu != EXIT);
		//저장
		save(fileName);

	}

	private void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(sm.getList());
		} catch (FileNotFoundException e) {
			//폴더 경로가 잘 못된 경우
			System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("불러오기에 실패했습니다.");
		}
	}

	private void load(String fileName) {
	try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInput ois = new ObjectInputStream(fis)){
			//sm.setList((ArrayList<Student>)ois.readObject());  <-?
			
		} catch (FileNotFoundException e) {
			//폴더 경로가 잘 못된 경우
			System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
	}

	@Override
	public void printMenu() {
		System.out.println("----메뉴------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회[전체]");
		System.out.println("3. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: insertStudent(); break;
		case 2: sm.printAll(); break;
		case 3: System.out.println("프로그램울 종료합니다."); break;
		default: throw new InputMismatchException(); 
		//↑얘가 출력되면 위에 try catch문의 inputmisamach가 실행됨
		}
	}

	private void insertStudent() {
		//학생 정보 입력
		System.out.print("학년 : ");
		int grade = scanner.nextInt();
		System.out.print("반 : ");
		int classNum = scanner.nextInt();
		System.out.print("번호 : ");
		int num = scanner.nextInt();
		System.out.print("이름 : ");
		String name = scanner.next();
		//학생 객체 생성
		Student std = new Student(grade, classNum, num, name);
		//추가를 해서 성공하면 성공알림, 실패하면 실패 알림
		if(sm.insertStudent(std)) {
			System.out.println("학생을 추가했습니다.");
			return;
		}
		System.out.println("이미 등록된 학생입니다.");
		
	}

	public static void main(String[] args) {
		

	}

}
