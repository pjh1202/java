package day13;

public class InterfaceEx2 {
	
	public static void main(String[] args) {
		print(new Product());
		print(new Student());
	}
	
	public static void print(Print p) {
		p.print();
	}

}

interface Print{
	void print();
}

class Product implements Print{

	String name = "TV";
	String code = "TV001";
	
	@Override
	public void print() {
		System.out.println("제품명 : " + name);
		System.out.println("제품코드 : " + code);
	}
	
}

class Student implements Print{
	String name = "홍길동";
	int grade = 1, num=1,classNum=1;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+grade+num+classNum);
	}	
}