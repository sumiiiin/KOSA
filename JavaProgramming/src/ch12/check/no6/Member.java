package ch12.check.no6;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	// 코드 작성
	//toString 메소드 오버라이딩
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return getId() + ": " + getName();
		
	}

}
