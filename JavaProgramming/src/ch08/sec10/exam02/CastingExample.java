package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // 인터페이스에만 있는 메소드( 클래스에서 오버라이딩 되긴 함)
		
		Bus bus = (Bus) vehicle; // Bus에서 만든 메소드를 사용하려면 강제 타입변환을 하고
		
		bus.checkFare(); // 클래스로 접근하여 메소드를 사용 할 수 있다.
		bus.run(); // 이것도 물론 된다.
		
		// 그럼 인터페이스 왜 써... 
		// 상속은 부모객체가 가진 필드와 메소드를 물려받으려고 사용하는 것
		// 상속에서 강제타입변환을 하는 이유는 자동타입변환에서 사용하지 못하는 것을 사용하기 위함
		// 그럼 자동타입변환을 하는 이유는? -> 다형성? 어떻게? -> ?

	}

}
