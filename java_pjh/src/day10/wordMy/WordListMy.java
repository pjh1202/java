package day10.wordMy;

public class WordListMy {
	
	//정보 : 게시일, 제목, 내용, 작성자, 조회수, 게시글 번호
	//정보 : 단어철자, 단어 뜻, 단어 확인번호, 맞춘 여부?
	String spelling, mean;
	int num, num2;
	
	public String getSpelling() {
		return spelling;
	}

	public void setSpelling(String spelling) {
		this.spelling = spelling;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public WordListMy(int num, String spelling, String mean, int num2) {
		this.num = num;
		this.spelling = spelling;
		this.mean = mean;
	}
	
	public void printWord() {
		System.out.println(spelling+" : "+mean);
	}
}
