package day18.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class ServerMain {
	
	private static List<Student> list;
	private static String fileName = "src/day18/student/list.txt";
	
	public static void main(String[] args) {
		int port = 5001;
		load();
		System.out.println(list);
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			while(true) {
				Thread t = new ServerThread(serverSocket.accept(), list);
				t.start();
				//save();
			}
		} catch (IOException e) {
			System.out.println("예외가 발생하여 서버를 종료합니다.");
		}
	}
	
	private static void save() {
		try {
			ObjectOutputStream foos = new ObjectOutputStream(new FileOutputStream(fileName));
			foos.writeObject(list);
			foos.flush();
		} catch(Exception e) {e.printStackTrace();}
	}
	
	private static void load() {
		try {
			ObjectInputStream fois = new ObjectInputStream(new FileInputStream(fileName));
			list = (List<Student>)fois.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			list = new ArrayList<Student>();
			e.printStackTrace();
			}
	}
}

@RequiredArgsConstructor
class ServerThread extends Thread{
	@NonNull
	private Socket socket;
	@NonNull
	List<Student> list; //서버에서 공유하는 학생리스트
	
	private ObjectInputStream ois; // 클라이언트에서 읽어올때 사용
	private ObjectOutputStream oos; //클라이언트에 보낼때 사용
	
	public void run() {
		try{
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			while(true) {
			String menu = ois.readUTF();
			switch(menu) {
			case "LOAD":
				load();
				System.out.println(list);
				break;
			case "INSERT":
				insert();
				System.out.println(list);
				break;
			case "SAVE":
				save();
				return;
			case "UPDATE":
				update();
				System.out.println(list);
				break;
				}
			}
		} catch (Exception e) {e.printStackTrace();}
	}

	private void update() {
		try {
			Student std = (Student) ois.readObject();
			int index = list.indexOf(std);
			if(index<0) {
				return;
			}
			list.get(index).setName(std.getName());
		} catch (Exception e) {e.printStackTrace();}
	}

	private void save() {
		String fileName = "src/day18/student/list.txt";
		try {
			ObjectOutputStream foos = new ObjectOutputStream(new FileOutputStream(fileName));
			foos.writeObject(list);
			foos.flush();
		} catch(Exception e) {e.printStackTrace();}
	}

	private void insert() {
		try {
			Student std = (Student)ois.readObject();
			list.add(std);
		}catch(Exception e) {e.printStackTrace();}
		
	}

	private void load() { //내가 가지고 있는 리스트를 전송만 해주는 로드
			try {
				oos.writeObject(list);
				oos.flush();
			} catch (IOException e) {e.printStackTrace();}
	}
}