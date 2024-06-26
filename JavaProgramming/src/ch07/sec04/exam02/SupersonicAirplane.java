package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
	
//	// Enum 타입 선언
//	public enum FlyMode{
//		NOMAL,
//		SUPERSONIC
//	}
	
	// 상태 필드 선언
	public FlyMode flyMode = FlyMode.NOMAL;
	
	// 메소드 재정의
	
	@Override
	public void fly() {
		if(flyMode == FlyMode.SUPUERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모 메소드 객체의 fly 메소드 호출
			// 이 메소드는 일반 비행한다고 출력하는 동작을 한다.
		}
	}

}
