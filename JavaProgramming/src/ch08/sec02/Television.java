package ch08.sec02;

public class Television implements RemoteControl{

	@Override
	public void turnOn() { // 인터페이스에 있는 추상메소드는 구현 클래스에 꼭 다 구현되어야 한다.
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
		
	}

}
