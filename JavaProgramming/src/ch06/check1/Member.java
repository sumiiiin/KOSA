package ch06.check1;

public class Member {
	
	// 필드 선언 (13번)
	String name;
	String id;
	String password;
	int age;
	
	// 생성자 선언 (14번)
	Member(String name, String id){
		this.id = id;
		this.name = name;
	}
	
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
