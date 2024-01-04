package day18.student;

import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class StudentManager {
	private List<Student> list = new ArrayList<Student>();
	
	public boolean checkStd(Student std) {
		if(list.contains(std)) {
			return true;
		}
		return false;
	}
	
	public void insertStd(Student std) {
		list.add(std);
	}
	public void showList() {
		list.stream().forEach(s->System.out.println(s));
	}

	public StudentManager(List<Student> list2) {
		if(list==null) {
			return;
		}
		this.list = list;
	}

	public boolean updateStudent(Student std) {
		int index = list.indexOf(std);
		
		if(index < 0) {
			return false;
		}
		list.get(index).setName(std.getName());
		return true;
	}	
}
