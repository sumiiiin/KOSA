package ch07.sec03.exam02;

public class Phone {
	// 필드 선언
	public String model;
	public String color;
	
	// 생성자 선언
	// 따로 선언하진 않았지만 하지 않아도 기본 생성자가 존재한다.
	// 하지만 다른 생성자를 선언 하고도 기본 생성자가 필요하다면 꼭 적어줘야 한다.
	public Phone(String model, String color) {
		System.out.println("부모 Phone 생성자 실행 ");
		this.model = model;
		this.color = color;
	}
	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기★: "+message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
