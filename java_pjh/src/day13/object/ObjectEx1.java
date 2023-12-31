package day13.object;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class ObjectEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//오브젝트 예제
		A a = new A();
		System.out.println(a.toString());
		Student std1 = new Student(1,1,1,"홍길동");
		Student std2 = new Student(1, 1, 1, "임꺽정");
		if(std1.equals(std2)) {
			System.out.println("학년, 반, 번호가 같습니다.");
		}
		else {
			System.out.println("학년, 반, 번호가 다릅니다.");
		}
		
		A a1 = new A();
		a1.num1 = 20;
		//a1 출력
		System.out.println(a1);
		A a2 = a1;
		a2.num1=30;
		//a2의 num1을 수정한 후 a1을 출력 : 공유하기 때문에 바뀜
		System.out.println(a1);
		A a3 = a1.clone();
		a3.num2 = 40;
		//a3의 num2를 수정한 후 a1을 출력 : 복제했기 때문에 바뀌지 않음
		System.out.println(a1);
	}
}

@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
	@Override
	public boolean equals(Object obj) {
		//같은 인스턴스를 공유하는지 확인(주소를 확인)
		if (this == obj)
			return true;
		//비교 대상이 있는지 없는지 확인
		if (obj == null)
			return false;
		//다른 클래스의 인스턴스인 경우
		if (getClass() != obj.getClass())
			return false;
		//다운캐스팅
		Student other = (Student) obj;
		//학년, 반, 번호가 모두 일치하는지 확인
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
}

@EqualsAndHashCode //전체를 기준으로 equlas를 구현하기 때문에 위에처럼 name은 뺴고 비교한다거나 이런거 못함
class A implements Cloneable{
	int num1 = 10;
	int num2 = 3;
	String name = "테스트";
	@Override//@data를 이용하면 고정으로 나오기 때문에 이런식으로 이용하면 내가 원하는 식으로 출력할 수 있음
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", name=" + name + "]";
	}
	
	@Override
	public A clone() throws CloneNotSupportedException{
		return (A)super.clone();
	}
	
}













