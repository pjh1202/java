package day17.socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientEx1 {
	public static void main(String[] args) {
		//ip, port번호 설정
		String ip = "192.168.30.195";
		int port = 5001;
		//ip와 port를 이용해 소켓생성 및 대기
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = null;
		try(Socket socket = new Socket(ip,port)) {
			//연결요청
			
			//작업
			System.out.println("연결 성공");
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			//서버에서 채팅 내역을 가져옴
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			list = (ArrayList<String>) ois.readObject();
			//채팅 내역을 조회
			System.out.println(list);
			while(true) {
				System.out.print("내용 [종료는 -1] : ");
				String str = scanner.nextLine();
				oos.writeUTF(str);
				oos.flush();
				if(str.equals("-1")) {
					break;
				}
				list.add(str);
			}
			oos.close();
			
		} catch (UnknownHostException e) {
			System.out.println("연결할 수 없습니다.");
		} catch (IOException e) {
			System.out.println("예외발생");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
