package ch07.sec02;

public class SmartPhone extends Phone{
	
	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		super(); // 안 써도 컴파일 과정에서 자동 실행, super()는 부모 생성자를 호출하는 것이다.
		// 근데 부모 생성자에 매개변수가 있으면 반드시 호출해야 함
		// 
		System.out.println("자식 SmartPhone 생성자 호출");
		this.model = model;
		this.color = color;
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
