package ch08.sec02;

public interface RemoteControl {
	
	public void turnOn(); // 실행은 안 함 단지 turnOn을 호출할 뿐임
	// abstract랑 다를게 없다. 근데 추상 메소드가 기본 값이라서 안 써도 됨
	// 근데 객체가 Tv도 있고 오디오도 있다면 각 클래스에 Tv메소드와 오디오 메소드에 
	// 이 메소드가 오버라이딩(재정의) 되어 있어야 해 -> 이것도 추.메 특
	// 어떤 객체가 인터페이스의 turnOn을 사용 할 수 있을까? 다른 객체에 같은 이름의 메소드 있으면 될까? ㄴㄴ
	// 클래스를 선언 할 때 class TV implement RemoteControl{ ... } 이렇게 객체 클래스 생성하고 메소드 오버라이딩 해야 함
	// remoteControl로 TV를 구현 할 수 있다라는 뜻
	
	// 근데 뭘 킬지 어떻게 알지...실행쪽에서 지정하는건가..?
	
	public void turnOff(); // 마치 메소드를 실행하는 것 처럼 사용

}
