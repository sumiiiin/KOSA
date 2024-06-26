package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc = null; // 널로 초기화해서 사용하면 NullPointerException 오류
		
		// 인터페이스로 사용할 객체 연결
//		rc = new Television(); // 텔레비전 객체로 초기화
		rc = new Audio(); // 오디오 객체로 초기화
		
		rc.turnOn();
		rc.setVolume(5);

		System.out.println();
		rc.setMute(true);
		rc.setMute(false);
		// 인터페이스에 정의 된 디폴트 메소드이지만 인터페이스만으로 사용 할 수 없음 -> 객체의 소속이기 때문이다.
		// 객체로 인터페이스를 대입하여 객체를 초기화 한 후 사용 할 수 있다.  
		rc.turnOff();
		
	}
	

}
