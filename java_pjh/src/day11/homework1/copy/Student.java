package day11.homework1.copy;

public class Student {
	//학생 학년, 반, 번호, 이름
	//성적들
	private String name;
	private int classNum, grade, num;
	private int count = 0;//등록된 과목 수
	private Subject[] subjects;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Subject[] getSubjects() {

		return subjects;
	}
	
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	public boolean insertSubject(String title, int score) { //과목입력
		
		for(Subject tmp : subjects) {
			if(tmp!= null && tmp.equals(title)) {
				return false;
			}
		}
		subjects[count++] = new Subject(title,score); 
		expandSubject();
		return true;
	}
	
	private void expandSubject() {
		if(subjects.length>count) {
			return;
		}
		Subject [] tmpList = new Subject[subjects.length+5];
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
		subjects=tmpList;
		
	}
	
	public boolean deleteSubject(String title) {
		//삭제할 과목이 어디있는지 확인하기 위한 변수로, 번지이기 때문에 -1이면 없음, 0이상이면 있음
		int index = -1;
		
		for(int i=0; i<count; i++) {
			if(subjects[i].equals(title)) {
				index = i;
			}
		}
		if(index==-1) {
			return false;
		}
		//있으면 삭제될 예정이기 때문에 전체 개수에서 하나 뺌
		count--;
		//삭제된 항목이 마지막 항목이면
		if(index == count) {
			subjects[index]=null;
			return true;
		}
		Subject tmpList[] = new Subject[subjects.length];
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
		System.arraycopy(tmpList, index+1, subjects, index, count-index);
		subjects[index]=null;
		return true;
	}
	
	public boolean updateSubject(String title, int score) {
		for(Subject tmp : subjects) {
			if(tmp != null && tmp.equals(title)) {
				tmp.updateScore(score);
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
		for(Subject tmp : subjects) {	
			if(tmp != null) {
				tmp.print();
			}
		}
	}
	public Student(String name, int classNum, int grade, int num) {
		this.name = name;
		this.classNum = classNum;
		this.grade = grade;
		this.num = num;
		subjects = new Subject[5];
	}
	
}
