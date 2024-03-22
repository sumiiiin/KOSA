package ch07.sec10.exam01;

public class IPhone extends MobilePhone{
	
	// field
	public String owner;
	
	// Constructor
	public IPhone(String owner) {
		super(owner); // 추상클래스인 부모 생성자 호출
		// 부모 생성자는 원래 같이 호출해야 한다.
		// 이래야 부모 클래스의 필드나 메소드가 초기화 되고 상속이 올바르게 된다.
		this.owner = owner;
	}
	
	// method
	public void turnOnn() {
		System.out.println("아이폰 전원을 켭니다.");
	}
	
	public void turnOffn() {
		System.out.println("아이폰 전원을 끕니다.");
	}
	
	
	@Override
	public void internetSeach() {
		System.out.println("사파리 브라우저로 인터넷을 검색합니다.");
		
	}
}
