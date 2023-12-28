package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		//정수를 5개 입력받아 입력받은 정수를 리스트에 저장하고 출력하는 코드
		Scanner scanner = new Scanner(System.in);//스캐너 객체 불러오기
		ArrayList<Integer> list = new ArrayList<Integer>();//ArrayList 객체 불러오기
		System.out.print("정수 5개 입력 : ");//콘솔창에 출력
		for(int i=0; i<5; i++) { //반복문을 통해 5번 반복시킴
			list.add(scanner.nextInt()); //콘솔창에서 리스트에 넣을 정수를 입력받음(5번 반복)
		}
		for(int i:list) { //향상된 for문 활용해서 리스트에 있는 정수들을 i로 불러옴
			System.out.print(i+" "); //불러온 i를 출력함
		}
	}

}

/*
 * 정수를 여러개 저장하기 위해 ArrayList 인스턴스를 생성
 * 정수이기 때문에 Integer를 추가. int가 안되는 이유는 제네릭은 클래스만 올 수 있어서
 * 
 * 콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스 생성
 * 콘솔창에서 입력받아야 하기 때문에 표준 입력이 System.in 인스턴슬르 전달해서 생성
 * 
 * System에 있는 out 인스턴스에서 제공하는 print 메서드를 이용하여 콘솔창에 문자열 출력
 * 
 * 5번 반복하기 위해 반복문 작성
 * i는 0부터 4까지 5번 반복
 * 
 * scanner.nextInt()를 통해 입력 버퍼에 있는 값 중 정수 값을 가져옴.
 * 만약 입력 버퍼에 정수가 아닌 문자나 문자열이 있으면 예외가 발생
 * 
 * Collection 에서 제공하는 add 메서드를 이용하여 리스트에 정수값을 추가
 * 
 * 리스트에 있는 정수들을 반복문으로 가져와서 i에 저장
 * 가져온 Integer의 인스턴스를 int형으로 언박싱을 함
 * 
 * 표준 출력(콘솔창)에 정수를 출력
 */