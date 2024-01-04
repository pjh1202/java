package day18.student;

import java.io.Serializable;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable {
	private static final long serialVersionUID = 1202L;
	
	int grade, classNum, num;
	String name;
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
	@Override
	public String toString() {
		return "Student [학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + ", 이름 : " + name + "]";
	}
}
