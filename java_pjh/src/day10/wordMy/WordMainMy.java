package day10.wordMy;
/*
 * 영어단어장 프로그램 만들기
 * 1. 기능정리
 * 
 * 외우고 싶은 단어와 뜻 사용자가 입력하면 리스트에 저장함
 * 뜻 맞추기와 단어 맞추기 두 가지 모드로 구분
 * 뜻 이나 단어를 말하면 같은지 비교하고 맞으면 점수+ 틀리면 점수-
 * 각 단어들은 무작위 값으로 나옴
 * 맞춘 단어는 나오지 않고 틀린 단어는 다시 나옴
 * 단어 삭제는 삭제하려는 단어를 입력하면 뜻과 함께 삭제됨
 * 
 * 2. 틀 작성
 * 
 * 1. 단어 맞추기 시작
 *   1. 뜻 맞추기
 *   2. 단어 맞추기
 * 2. 단어 입력
 *   철자 입력 : 
 *   뜻 입력 : 
 * 3. 단어 수정
 *   뜻 검색
 *     단어 수정
 *   단어 검색
 *     뜻 수정
 * 4. 단어 삭제
 *   삭제하려는 단어 입력 : 
 * 5. 단어 조회
 * 6. 프로그램 종료
 * 
 * 3. 필요한 메서드 구현
 */

import java.util.Scanner;

public class WordMainMy {
	static int num = 0, count = 0;
	private static Scanner scanner = new Scanner(System.in);
	public static WordListMy word[] = new WordListMy[5];
	
	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			run(menu);
		} while(menu != 6); 
	}
	
	private static void run(int menu) {
		switch(menu) {
		case 1:
			switch(printSubMenu()) {
			case 1: //뜻 맞추기
				meanGame();
				break;
			case 2: //단어 맞추기
				spellingGame();
				break;
			case 3:
				//단어 수정
				wordUpdate();
				break;
			case 4:
				System.out.println("메인메뉴로 이동합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴 입력");
				break;
			}
			break;
		case 2:
			insertWord();
			break;
		case 3:
			deleteWord();
			break;
		case 4:
			showWord();
			break;
		case 5:
			wordUpdate();
			break;
		case 6:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
			break;
		}
	}

	private static void showWord() {
		for(int i=0;i<count;i++) {
			word[i].printWord();
		}
	}

	private static void wordUpdate() {
		System.out.print("수정할 뜻 또는 철자 입력 : ");
		String user = scanner.next();
		for(int i=0; i<count; i++) {
			if(user.equals(word[i].getMean()) || user.equals(word[i].getSpelling())) {
				System.out.println("수정할 단어 "+word[i].getMean()+ " : "+ word[i].getSpelling());
				System.out.print("수정할 뜻 : ");
				word[i].setMean(scanner.next());
				System.out.print("수정할 철자 : ");
				word[i].setSpelling(scanner.next());
				break;
			}
		}
		System.out.println("찾으시는 뜻이나 철자가 없습니다.");
	}

	private static void spellingGame() {
		String user;
		double win=0, loss=0;
		int max = count;
		for(int i=0; i<count;) {
			int com = (int)(Math.random()*(max));
			if(word[com].getNum2() == 0) {
				String gameWord = word[com].getSpelling();
				System.out.println(word[com].getMean());
				System.out.print("철자 : ");
				user = scanner.next();
				if(user.equals(gameWord)) {
					System.out.println("정답입니다.");
					i++;
					win++;
					word[com].setNum2(1);
				}
				else {
					System.out.println("오답입니다.");
					loss++;
				}
			}
		}
		double a = (double)((win/(win+loss))*100);
		System.out.println("정답횟수 : "+(int)win+" | 오답횟수 : "+(int)loss+"| 정답률 : " + a);
		for(int j=0; j<count; j++) {
			word[j].setNum2(0);
		}
	}
	
	private static void meanGame() {
		String user;
		double win=0, loss=0;
		int max = count;
		for(int i=0; i<count;) {
			int com = (int)(Math.random()*(max));
			if(word[com].getNum2() == 0) {
				String gameWord = word[com].getMean();
				System.out.println(word[com].getSpelling());
				System.out.print("뜻 : ");
				user = scanner.next();
				if(user.equals(gameWord)) {
					System.out.println("정답입니다.");
					i++;
					win++;
					word[com].setNum2(1);
				}
				else {
					System.out.println("오답입니다.");
					loss++;
				}
			}
		}
		double a = (double)((win/(win+loss))*100);
		System.out.println("정답횟수 : "+(int)win+" | 오답횟수 : "+(int)loss+"| 정답률 : " + a);
		for(int j=0; j<count; j++) {
			word[j].setNum2(0);
		}
	}

	private static int printSubMenu() {
		System.out.println("1. 뜻 맞추기");
		System.out.println("2. 단어 맞추기");
		System.out.println("3. 뒤로가기");
		System.out.print("메뉴 선택 : ");
		return scanner.nextInt();
	}

	private static void deleteWord() {
		int index = -1;
		System.out.print("삭제할 뜻 또는 철자 입력 : ");
		String user = scanner.next();
		for(int i=0; i<count; i++) {
			if(user.equals(word[i].getMean()) || user.equals(word[i].getSpelling())) {
				index = i;
				if(index == -1) {
					System.out.println("일치하는 철자나 뜻이 없습니다.");
					return;
				}
				count--;
				//마지막 게시글을 삭제했다면
				if(index == count) {
					System.out.println("마지막 단어 삭제 완료");
					return;
				}
				//찾은 번지 다음부터 한칸씩 당겨옴
				//기본 배열을 크기가 같은 새 배열을 생성
				WordListMy [] tmpList = new WordListMy[word.length];
				//기존 배열을 복사
				System.arraycopy(word, 0, tmpList, 0, word.length);
				//기존 배열에서 찾은 번지 다음부터 나머지 개수를 복사해서
				//새 배열에서 찾은 번지부터 덮어씀
				System.arraycopy(tmpList, index+1, word, index, count-index);
				System.out.println("단어 삭제 완료");
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 단어 맞추기");
		System.out.println("2. 단어 입력");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 단어 조회");
		System.out.println("5. 단어 수정");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}

	public static void insertWord(){
		System.out.print("단어 철자 입력 : ");
		String title = scanner.next();
		System.out.print("\n단어 뜻 입력 : ");
		String mean = scanner.next();
		WordListMy wordNameListMy = new WordListMy(num++, title, mean, 0);
		word[count++] = wordNameListMy;
		
		if(count<word.length) {
			return;
		}
		//배열이 꽉차면 배열 늘려줌
		WordListMy[] tmpList = new WordListMy[word.length + 5];
		//새로 생성된 배열에 기존 배열 복사
		System.arraycopy(word, 0, tmpList, 0, count);
		//새로 생성된 배열은 word에 연결
		word = tmpList;
	}
	
}
