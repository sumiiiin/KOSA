package ch06.check1;

public class MemberService {
	
	// 필드 선언
	String name;
	String id;
	String password;
	int age;
	
	// 메소드 (15번)
	public boolean login(String id, String password){
		this.id = id;
		this.password = password;
		
		if (password == "12345" && id == "hong") {
			return true;	
		} else {
			return false;
		}
		
	}
	
	public void logout(String id) {
		this.id = id;
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
}
