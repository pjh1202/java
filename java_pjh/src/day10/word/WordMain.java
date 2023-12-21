package day10.word;
/*
 * 영어단어장 프로그램 만들기
 * 1. 기능정리
 * 
 * - 단어는 영어 단어와 한글 뜻으로 구성
 * - 영어 단어는 영어이고, 공백이 없는 단어
 * - 한글 뜻은 한글이고, 한 문장으로 되어 있다
 * - 한 단어의 뜻이 한개만 있다고 가정
 * 
 * - 기능
 *   - 단어 등록
 *   - 단어 검색
 *   - 단어 수정
 *   - 단어 삭제
 * 
 * 2. 틀 작성
 * 
 * 3. 필요한 메서드 구현
 */

import java.util.Scanner;

public class WordMain {
	private static Scanner scanner = new Scanner(System.in);
	private static Word[] List = new Word[10];
	private static int count = 0;
	
	public static void main(String[] args) {
		int menu;
		//반복문
			
			//메뉴 출력
			
			//메뉴 선택
		
			//선택한 메뉴에 맞는 기능 실행
		do {
			printMenu();
			menu = scanner.nextInt();
			runMenu(menu);
		} while(menu != 5);
		
	}
	public static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertWord();
			break;
		case 2:
			searchWord();
			break;
		case 3:
			updateWord();
			break;
		case 4:
			deleteWord();
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
			break;
		}
	}
	private static void deleteWord() {
		//단어 삭제
		int index = -1;
		System.out.println("삭제할 단어 입력 : ");
		String word = scanner.next();
		for(int i=0; i<count; i++) {
			if(List[i].equals(word)) {
				index=i;
				List[i].setWord(word);
				count--;
				if(index==count) {
					System.out.println("단어 삭제 완료");
					return;
				}
				
				Word tmpList[] = new Word[List.length];
				System.arraycopy(List, 0, tmpList, 0, List.length);
				System.arraycopy(tmpList, index+1, List, index, count-index);
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}
	private static void updateWord() {
		// 단어 수정
		System.out.print("수정할 단어 입력 : ");
		String word = scanner.next();
		System.out.println("수정할 뜻 입력 : ");
		scanner.nextLine();
		String meaning = scanner.nextLine();
		for(int i=0; i<count; i++) {
			if(List[i].equals(word)) {
				List[i].update(meaning);
				System.out.println("단어가 수정되었습니다.");
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}
	
	private static void searchWord() {
		//단어 검색
		//검색할 단어 입력 
		System.out.print("검색할 단어 입력 : ");
		String word = scanner.next();
		
		for(int i=0; i<count; i++) {
			if(List[i].equals(word)) {
				List[i].print();
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}
	private static void insertWord() {
		//단어와 뜻 입력
		System.out.print("단어 : ");
		String word = scanner.next();
		
		System.out.print("의미 : ");
		scanner.nextLine(); //엔터처리
		String meaning = scanner.nextLine();
		
		//단어와 뜻을 이용하여 Word의 인스턴스를 생성
		Word tmp = new Word(word, meaning);
		
		//위에서 생성한 인스턴스를 단어장에 저장
		//저장된 단어의 개수를 1증가
		List[count++] = tmp;
		
		if(count == List.length) {
			expandWordList();
		}
		
	}
	private static void expandWordList() {
		//기존 단어장 보다 큰 새 단어장 생성
		Word[] tmpList = new Word[List.length+10];
		System.arraycopy(List, 0, tmpList, 0, count);
		List = tmpList;
	}
}
