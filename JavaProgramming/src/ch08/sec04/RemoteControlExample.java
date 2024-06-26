package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// 인터페이스로 사용할 객체 연결
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		
		use(new Audio());
		
	}
	
	public static void use(RemoteControl rc) { 
		// private로 해도 내부에서 사용하기 때문에 괜찮음
		// 객체생성 없이 사용해야 하기 때문에 static이고 내부에 있어서 딱히 클래스로 접근은 안하나?
		// 리턴 값은 없고 매소드 호출만 하는 동작을 하기 때문에 void
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
