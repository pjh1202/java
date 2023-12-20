package day09.board;

import java.util.Scanner;
//파란색 주석은 마우스를 위에 올리면 내가 적어둔 설명이 나옴(/**엔터)
public class BoardMain {
	/*게시판에서 게시글 관리를 위한 콘솔 프로그램 작성
	 *  -제한사항 정리
	 *    -게시판은 1개
	 *    -로그인, 회원가입 구현 X => 게시글 작성 시 아이디 입력
	 *    -게시글 제목과 내용은 한 줄만 가능 
	 *    -작성일을 입력(원래는 자동으로 들어가야함)
	 * 
	 * 1. 필요한 기능을 정리해서 메뉴로 출력
	 *
	 * 메뉴
	 *   1. 게시글 목록 조회
	 * 	 2. 게시글 등록
	 *   3. 게시글 프로그램 종료
	 *   메뉴 선택 : 1
	 *   
	 * 게시글 목록
	 *   2. 가입인사 2023-12-20 (아이디) (조회수 : 1)
	 *   1. 공지 2023-12-19 (아이디) (조회수 : 3)
	 *   
	 * 메뉴
	 *   1. 게시글 상세 조회
	 *   2. 게시글 수정
	 *   3. 게시글 삭제
	 *   4. 뒤로가기
	 *   메뉴 선택 : 1
	 *   
	 *   조회할 게시글 번호 : 2
	 *   번호 : 2
	 *   제목 : 가입인사
	 *   내용 : 안녕하세요.
	 *   일자 : 2023-12-20
	 *   작성자 : (아이디)
	 *   조회수 : 2
	 * 게시글 목록
	 *   2. 가입인사 2023-12-20 (아이디) (조회수 : 1)
	 *   1. 공지 2023-12-19 (아이디) (조회수 : 3)
	 *   
	 *메뉴
	 *   1. 게시글 상세 조회
	 *   2. 게시글 수정
	 *   3. 게시글 삭제
	 *   4. 뒤로가기
	 *   메뉴 선택 : 2
	 *   수정할 게시글 번호 : 2
	 *   제목 : 가입인사입니다.
	 *   내용 : 만나서 반갑습니다.
	 *   수정이 완료됐습니다.
	 *   
	 * 게시글 목록
	 *   2. 가입인사 2023-12-20 (아이디) (조회수 : 1)
	 *   1. 공지 2023-12-19 (아이디) (조회수 : 3)
	 *   
	 * 메뉴
	 *   1. 게시글 상세 조회
	 *   2. 게시글 수정
	 *   3. 게시글 삭제
	 *   4. 뒤로가기
	 *   메뉴 선택 : 3
	 *   삭제할 게시글 번호 : 1
	 *   게시글이 삭제됐습니다. 
	 *   
	 * 메뉴
	 *   1. 게시글 상세 조회
	 *   2. 게시글 수정
	 *   3. 게시글 삭제
	 *   4. 뒤로가기
	 *   메뉴 선택 : 4
	 *   
	 * 메뉴
	 *   1. 게시글 목록 조회
	 * 	 2. 게시글 등록
	 *   3. 게시글 프로그램 종료
	 *   메뉴 선택 : 2
	 *   제목 : 테스트
	 *   내용 : 테스트
	 *   일자 : 
	 *   아이디 :
	 *   등록이 완료됐습니다. 
	 *   
	  * 메뉴
	 *   1. 게시글 목록 조회
	 * 	 2. 게시글 등록
	 *   3. 게시글 프로그램 종료
	 *   메뉴선택 : 1
	 * 게시글 목록
	 *   3. 테스트 2023-12-20 (아이디) (조회수 : 0)
	 *   2. 가입인사 2023-12-20 (아이디) (조회수 : 1) 
	 *   
	 *   
	 * 2. 기능을 구현
	 * 
	 * (반복문)
	 * 메뉴
	 *   1. 게시글 목록 조회
	 * 	 2. 게시글 등록
	 *   3. 게시글 프로그램 종료
	 *   메뉴 선택 : 
	 *   
	 *(게시글 목록 조회)
	 * 메뉴
	 *   1. 게시글 상세 조회
	 *   2. 게시글 수정
	 *   3. 게시글 삭제
	 *   4. 뒤로가기
	 *   메뉴 선택 : 
	 * 
	 * 게시글 목록 조회
	 *  -게시글 상세조회
	 *    -조회할 게시글 번호 : 
	 *    게시글 내용들  
	 *  -게시글 수정
	 *    수정할 게시글 번호 : 
	 *    게시글 수정 내용들(제목, 내용)
	 *  -게시글 삭제
	 *    삭제할 게시글 번호 : 
	 *    게시글 삭제
	 *  -뒤로가기
	 * 
	 * 게시글 등록
	 *   -게시글 제목, 내용, 일자, 아이디
	 *   
	 * 프로그램 종료
	 * 
	 * 중복된 것
	 * 게시글 목록 조회
	 * 메인메뉴, 게시글 목록조회 메뉴
	 * 
	 * 메인메뉴는 메인 클래스에 만듬
	 * 서브 메뉴도 메인 클래스에 만듬
	 * 게시글 조회는 다른 클래스로 만들어서 사용
	 * 게시글 등록, 게시글 상세조회, 게시글 수정, 게시글 삭제
	 */
	private static Scanner scanner = new Scanner(System.in);
	private static Board [] boardList = new Board[5]; //게시글 목록
	private static int boardNum = 1; //추가될 게시글 번호
	private static int count = 0; //현재 등록된 게시글 개수
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			runMenu(menu);
			
		}while(menu != 3);
	}
	private static void printMenu() {
		System.out.println("---------메뉴---------");
		System.out.println("1. 게시글 목록 조회");
		System.out.println("2. 게시글 등록");
		System.out.println("3. 프로그램 종료");
		System.out.println("---------------------");
		System.out.print("메뉴 선택 : ");
	}
	/**
	 * menu가 주어지면 menu에 맞는 기능을 실행하는 메서드
	 * @param menu 실행할 메뉴의 번호
	 * 
	 */
	private static void runMenu(int menu) {
		switch (menu) {
		case 1: {
			//runBoard();
			//게시글 목록 출력. 번호가 높은 순으로
			for(int i=count-1; i>=0; i--) {
				boardList[i].printInfo();
			}
			//서브메뉴 출력
			printSubMenu();
			//서브메뉴 선택 
			int subMenu = scanner.nextInt();
			//서브메뉴에 맞는 기능 실행
			runSubMenu(subMenu);
			break;
		}
		case 2: {
			//게시글 등록 기능 구현
			insertBoard();
			break;
		}
		case 3: {
			System.out.println("프로그램 종료");
			break;
		}
		default:
			System.out.println("잘못된 메뉴 입력");
		}
	}
	private static void runSubMenu(int subMenu) {
		switch(subMenu) {
		case 1: //게시글 상세 조회
			printBoardDetail();
			break;
		case 2: //게시글 수정
			updateBoard();
		case 3: //게시글 삭제
			deleteBoard();
			break;
		case 4:
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	private static void deleteBoard() {
		System.out.print("삭제할 게시글 번호 : ");
		int num=scanner.nextInt();
		int index = -1;
		if(num>count) {num=count;}
		for(int i=0; i<count; i++) {
			if(num==boardList[i].getNum()) {
				index = i;
				if(index == -1) {
					System.out.println("일치하는 게시글이 없습니다.");
					return;
				}
				count--;
				//마지막 게시글을 삭제했다면
				if(index == count) {
					return;
				}
				//찾은 번지 다음부터 한칸씩 당겨옴
				//기본 배열을 크기가 같은 새 배열을 생성
				Board [] tmpList = new Board[boardList.length];
				//기존 배열을 복사
				System.arraycopy(boardList, 0, tmpList, 0, boardList.length);
				//기존 배열에서 찾은 번지 다음부터 나머지 개수를 복사해서
				//새 배열에서 찾은 번지부터 덮어씀
				System.arraycopy(tmpList, index+1, boardList, index, count-index);
				break; 
			}
		}
	}
	private static void updateBoard() {
		String title, contents;
		System.out.print("수정할 게시글 번호 : ");
		int num=scanner.nextInt();
		for(int i=0; i<count; i++) {
			if(num==boardList[i].getNum()) {
				scanner.nextLine();
				System.out.print("수정할 제목 입력 : ");
				title = scanner.nextLine();
				System.out.print("수정할 내용 입력 : ");
				contents = scanner.nextLine();
				boardList[i].update(title, contents);
				return; 
			}
		}
		System.out.println("일치하는 게시글이 없습니다.");
	}
	private static void printBoardDetail() {
		System.out.print("조회할 게시글 번호 : ");
		int num=scanner.nextInt();
		for(int i=0; i<count; i++) {
			if(num==boardList[i].getNum()) {
				boardList[i].printInfoDetail();
				return; 
			}
		}
		System.out.println("일치하는 게시글이 없습니다.");
	}
	/**게시글 목록 조회 시 나타나는 서브메뉴를 출력하는 메서드*/
	private static void printSubMenu() {
		System.out.println("-------서브메뉴---------");
		System.out.println("1. 게시글 상세 조회");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 뒤로가기");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
	}
	/** 게시글 정보를 입력받아 게시글을 등록하는 메서드*/
	private static void insertBoard() {
		scanner.nextLine();         //입력버퍼에 남아있는 엔터 처리
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		System.out.print("내용 : ");
		String contents = scanner.nextLine();
		System.out.print("일자 : ");
		String date = scanner.next();
		System.out.print("작성자 : ");
		String writer = scanner.next();
		
		Board board = new Board(boardNum++, title, contents, writer, date);
		boardList[count++] = board;
		//배열 크기를 안늘려도 되면 종료
		if(count<boardList.length) {
			return;
		}
		//배열이 꽉차면 배열 늘려줌
		Board[] tmpList = new Board[boardList.length + 5];
		//새로 생성된 배열에 기존 배열 복사
		System.arraycopy(boardList, 0, tmpList, 0, count);
		//새로 생성된 배열은 boardList에 연결
		boardList = tmpList;
	}
}