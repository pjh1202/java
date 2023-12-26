package day11.homework1;

public class Subject {
	//과목이름, 과목성적
	String subject;
	int score;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Subject(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}
}
