package day15.student;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	//학생 - 학년, 반, 번호, 이름
	//성적 - 국어, 영어, 수학
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;
	
	public Student(int grade, int classNum, int num) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}

	public Student(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}


	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	
}
/*
 * 학생 추가 : 학년 반 번호 이름 받는 생성자
 * 성적 추가 : 점수 받으면 그에 맞는 성적 추가해주는 생성자
 */