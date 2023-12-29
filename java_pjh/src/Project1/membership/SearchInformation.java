package Project1.membership;

//import java.util.Date;
import lombok.Data;

//아이디 비밀번호 이메일 이름 생년월일 휴대폰번호 관리자 코드?
@Data
public class SearchInformation {
	
	String id, pw, email, name;
	//생년월일
	int number, managerCode;
	public SearchInformation(String id, String pw, String email, String name, int number, int managerCode) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.name = name;
		this.number = number;
		this.managerCode = managerCode;
	}
	
}
