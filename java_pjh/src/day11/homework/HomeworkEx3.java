package day11.homework;

public class HomeworkEx3 {
	/*
	 * 사이트에서 회원 관리(로그인, 회원가입 등)를 위한 Member 클래스를 작성
	 * 
	 * 작성한 Member 클래스를 이용하여 인스턴스를 생성하고 구현한 메서드를 테스트
	 * 
	 * 추상화만 해보는 것 구현까지는 X
	 * 
	 * Car 처럼
	 */
	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		//아이디와 비번이 없는 인스턴스 생성
		member1.print();
		//아이디와 비번이 없는 인스턴스이기 때문에 아이디 abc와 비번def로 비교하면 false
		System.out.println(member1.equals("abc", "def"));
		
		//아이디와 비번 이메일이 있는 인스턴스 생성
		Member member2 = new Member("abc","def","abc@naver.com");
		member2.print();
		System.out.println(member2.equals("abc","def"));
	}
}

class Member {
	//필요한 멤버변수 및 메서들르 정리하고 구현
	//멤버변수 : 아이디, 비번, 이메일
	
	//getter,setter
	
	//equals 아이디 비번이 주어지면 내 정보와 같은지 다른지 알려주는 메서드
	
	//생성자 : 기본생성자, 아이디 비번 이메일이 필요한 생성자, 아이디 비번이 필요한 생성자
	
	private static String id, password, email;

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Member.id = id;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Member.password = password;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Member.email = email;
	}
	
	public boolean equals(String id, String password) {
		if(this.id==null) {
			//아이디가 없으면
			System.out.println("아이디가 존재하지 않습니다.");
			return false;
		}
		if(this.password==null) {
			//아이디가 있으면
			System.out.println("비밀번호가 존재하지 않습니다.");
			return false;
		}
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	
	//회원정보를 출력하는 메서드
	public void print() {
		System.out.println("아이디 : " + id);
		System.out.println("이메일 : " + email);
		System.out.println("비밀번호 : " + password);
	}
	
	public Member() {}
	
	public Member(String id, String password, String email) {
		//아이디, 비번, 이메일 받는 생성자
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public Member(String id, String password) {
		//아이디, 비번 받는 생성자
		this.id = id;
		this.password = password;
	}
	
}
