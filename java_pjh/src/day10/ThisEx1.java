package day10;
//클래스 앞에 public은 자바클래스 파일 이름과 같은 이름의 클래스일 때만 붙일 수 있음.
public class ThisEx1 {

	public static void main(String[] args) {
		// this 예제	
		Point point = new Point();
		point.print();
		Point point2 = new Point(1,2);
		point2.print();
	}
}

//점을 나타내는 Point 클래스

class Point {
	private int x,y; //멤버변수는 기본값으로 초기화 되어있음
	
	public int getX() {
		return x;        //<- 멤버변수x임 따라서 this를 생략해도 됨
	}

	public void setX(int x) {
		this.x = x; //매개변수 x와 멤버변수 x를 구분하기 위해서 this를 반드시 써야함
		            //this를 쓰지 않으면 멤버변수x로 인식함
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point(int x, int y) {
		//this() <-무한루프에 빠질 수 있음 기본 생성자는 매개변수 2개 생성자를 부르고 
		//매개변수 2개 생성자는 기본생성자를 부르게 되서 무한루프
		this.x = x;
		this.y = y; //<-여기서도 this 반드시 써야함
		System.out.println("매개변수 2개 생성자");
	}
	public Point() { //<-매개변수가 없는 기본 생성자
		this(0,0); //x=0,y=0으로 초기화 하기 위해 위에 있는 생성자를 호출
		//this 생성자는 무조건 첫 줄 this앞에 다른 실행문이 들어가면 안됨 
		System.out.println("기본생성자");
	}
	public void print() {
		System.out.println("("+x+","+y+")");
	}
}
//this를 잘못 사용하면 객체 초기화가 완료되지 않을 수 있기 때문에
//유의해서 사용해야 함.