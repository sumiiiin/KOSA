package ch07.sec10.exam01;

public abstract class MobilePhone { 
	// 안드로이드 폰이랑 아이폰 둘 다 해당하는 필드랑 메소드 모아 둠 
	// abstract 선언하면 추상클래스가 됨
	// field
	public String owner;
	
	// Constructor -> 생성자 선언 했지만 추상클래스 이기 때문에 사용 할 수 없음
	public MobilePhone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
	System.out.println("폰 전원을 켭니다.");
	}
		
	public void turnOff() {
	System.out.println("폰 전원을 끕니다.");
	}
		
	public abstract void internetSeach(); 
	// 공통된 기능인데 객체마다 실행이 다를 경우 실행문 작성은 하지말고 추상메소드로만 만든다.
	// 실행 내용을 결정 할 수 없는 메소드가 추상메소드
	// 추상 클래스에서만 추상메소드를 가질 수 있다.
}
