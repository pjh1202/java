package day11.homework1.copy;
//고정된 과목이 아니라 다양한 과목을 등록하고 활용하기 위해
public class Subject {
	//과목명, 총점
	private String title;
	private int score;//총점

	public String getSubject() {
		return title;
	}
	public void setSubject(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

	
	public void updateScore(int score) {
		setScore(score);
	}
	//과목 정보를 출력
	
	public boolean equals(String title) {
		if(this.title == null) {
			return false;
		}
		return this.title.equals(title);
	}
	
	public void print() {
		System.out.println("과목명 : " + title + "점수 : " + score);
	}
	
	public Subject(String title, int score) {
		this.title = title;
		this.score = score;
	}
	
	public Subject(String title) {
		this.title = title;
	}
	
}
