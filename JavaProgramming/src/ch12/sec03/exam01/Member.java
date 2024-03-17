package ch12.sec03.exam01;

public class Member {
	public String id; // 필드

	public Member(String id) { // 생성자
		this.id = id;
	}

	 //메소드 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) { // Member사 obj으로 타입 변환 되는지 확인하고 되면 target변수에 obj타입의 객체를 넣는다.
			if(id.equals(target.id)) { // 
				System.out.println(target.getClass());
				return true;
			}
		}
		return false;
	}
}