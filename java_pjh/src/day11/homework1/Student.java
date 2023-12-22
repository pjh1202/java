package day11.homework1;

public class Student {
	//학생 이름, 번호, 반, 학년
	String name;
	int number, group, year;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student(String name, int number, int group, int year) {
		this.group = group;
		this.name = name;
		this.number = number;
		this.year = year;
	}
	
	
	
}
