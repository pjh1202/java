package day18.student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Program.Program;


public class StudentProgram implements Program {
	private Scanner scanner = new Scanner(System.in);
	private StudentManager sm = new StudentManager();
	Socket socket;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	@Override
	public void run() {
		String ip = "192.168.30.195";
		int port = 5001;
		connectServer(ip, port); //서버와 연결
		load(); //서버에서 학생 정보를 불러옴
		int menu = 0;
		do {
			try {
			printMenu();
			menu = scanner.nextInt();
			runMenu(menu);
			} catch(InputMismatchException e){
				System.out.println("잘못된 메뉴를 선택했습니다.");
				scanner.nextLine();
			}
		}while(menu!=4);	
	}
	
	private void connectServer(String ip, int port) {
		try {
			socket = new Socket(ip,port);
			System.out.println(socket);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			System.out.println("[서버 연결 성공]");
		} catch (Exception e) {
			System.out.println("[서버 연결 실패]");
		}
		
	}
	
	private void load() {
		if(socket == null) {
			System.out.println("서버에 연결되지 않아 불러올 수 없습니다.");
		}
		try {
			oos.writeUTF("LOAD");
			oos.flush();
			List<Student> list = (List<Student>)ois.readObject();
			sm = new StudentManager(list);
			System.out.println("불러오기 성공");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("불러오기 중 예외가 발생했습니다.");
		}
	}

	@Override
	public void printMenu() {
		System.out.println("---메뉴---");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생조회");
		System.out.println("3. 학생 수정(이름)");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: insertStudent(); break;
		case 2: showStudent();  break;
		case 3: updateStudent(); break;
		case 4: exit(); System.out.println("프로그램을 종료합니다."); break;
		default: new InputMismatchException(); break;
		}
	}
		
		private void updateStudent() {
			System.out.println("등록할 학생의 정보를 입력하세요");
			System.out.print("학년 : ");
			int grade = scanner.nextInt();
			System.out.print("반 : ");
			int classNum = scanner.nextInt();
			System.out.print("번호 : ");
			int num = scanner.nextInt();
			System.out.print("이름 : ");
			String name = scanner.next();
			Student std = new Student(grade, classNum, num, name);
			if(sm.updateStudent(std)) {
				System.out.println("이름을 수정했습니다.");
				sendUpdateStudent(std);
			} else {
				System.out.println("등록되지 않은 학생입니다.");
			}
		}

		private void sendUpdateStudent(Student std) {
			try {
				oos.writeUTF("UPDATE");
				oos.flush();
				oos.writeObject(std);
				oos.flush();
			} catch (IOException e) {e.printStackTrace();}
		}

		private void exit() {
			try {
				oos.writeUTF("SAVE");
				oos.flush();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

		private void insertStudent() {
			System.out.println("등록할 학생의 정보를 입력하세요");
			System.out.print("학년 : ");
			int grade = scanner.nextInt();
			System.out.print("반 : ");
			int classNum = scanner.nextInt();
			System.out.print("번호 : ");
			int num = scanner.nextInt();
			System.out.print("이름 : ");
			String name = scanner.next();
			Student std = new Student(grade, classNum, num, name);
			if(sm.checkStd(std)) {
				System.out.println("같은 정보의 학생이 있습니다.");
				return;
			}
			sm.insertStd(std);
			sendStudent(std);
		}
		private void sendStudent(Student std) {
			if(socket == null) {
				System.out.println("서버에 연결되지 않아 서버에 학생 정보를 추가할 수 없습니다.");
			}
			try {
				oos.writeUTF("INSERT");
				oos.flush();
				oos.writeObject(std);
				oos.flush();
				
				System.out.println("서버에 학생 추가 성공");
			} catch (IOException e) {
				System.out.println("서버에 학생 추가 중 예외가 발생했습니다.");
			}
		}

		private void showStudent() {
			sm.showList();
		}
}
