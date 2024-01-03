package HomeWordEx1;

import java.util.ArrayList;

public class HomeWorkManager {
	
	private ArrayList<Vocabulary> list = new ArrayList<Vocabulary>();
	
	//단어, 품사, 뜻을 입력받으면 추가해주는 메서드
	//만약 동일한 단어가 있을 시 추가안함
	
	public int showIndexNum(String word) {//word를 입력받으면 주솟값 반환
		Vocabulary w = new Vocabulary(word);
		return list.indexOf(w);
	}
	
	public void showWord(int index) {
		list.get(index);
	}
	
	public void insertMean(String word, String mean1) {
		list.get(showIndexNum(word)).mean.add(mean1);
	}
	
	public void deleteMean(String word, String mean1) {
		list.get(showIndexNum(word)).mean.remove(mean1);
	}
	
	public void insertWord(Vocabulary v) {
		list.add(v);
	}
	
	public boolean checkWord(String word) {
		Vocabulary w = new Vocabulary(word);
		if(list.contains(w)) {
			return true;
		}
		return false;
	}
	
	public void deleteWord(String word) {
		list.remove(showIndexNum(word));
	}
	
	//단어 정보 출력
	public void printAll() {
		list.stream().forEach(s->System.out.println(s));
		//단어 뜻 모두 출력		
	}
}
