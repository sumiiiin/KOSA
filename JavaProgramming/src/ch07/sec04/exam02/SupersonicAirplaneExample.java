package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane spa = new SupersonicAirplane();
		
		spa.takeOff(); // 이륙을 함
		
		spa.flyMode = FlyMode.NOMAL ; // 모드 설정
		spa.fly(); // 비행을 함 
		
		
		// SUPERSONIC은 상수라서 클래스로 접근 한다.
		spa.flyMode = FlyMode.SUPUERSONIC; // 객체로 접근해도 된긴 함 경고 뜨긴 해도
		
		spa.fly();
		
		spa.land();

	}

}
