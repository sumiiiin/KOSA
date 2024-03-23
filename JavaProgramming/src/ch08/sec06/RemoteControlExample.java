package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스로 정적 메소드 호출
		RemoteControl.changeBattery();
		// 인터페이스 메소드가 호출 됨....객체 생성은 아니고 클래스..도 아니고 인터페이스로 접근한 메소드임
		// 구현객체의 기능과 관련 없는 동작을 해야 할 때 쓴다. 

	

}
}

