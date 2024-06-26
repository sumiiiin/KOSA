package ch06.check1;

public class ShopService {
	
	// 필드 선언
	private static ShopService shopService = new ShopService();
	// 2. 객체 생성 하고 내부 접근만 허용, 정적 멤버로 선언하여 클래스로 접근해 메소드 메모리로 넘겨?
	//-> 메소드에서 호출할거야
	
	// 생성자 선언
	private ShopService() { // 1. 생성자 호출 내부접근만 허용 -> 필드에서 객체 생성 하려고
		// 생성자는 static으로 못 해 -> 생성자 호출이 객체 초기화이니까!
	}
	
	// 메소드 선언
	public static ShopService getInstance() { // getInstance는 사용자가 설정하는 변수 명임
		return shopService; // 메소드 호출하면 내부 필드에 생성한 객체 반환
		// 반환 받을 값이 객체이기 때문에 클래스타입으로 받는다. void 자리엔 반환 받을 타입 적기
		
	}
	
	
	// 싱글톤이란
	// 객체를 하나만 생성해서 사용하는것
	// 내부 필드와 내부 생성자를 만들고 메소드를 퍼블릭으로 해서 
	// 메소드를 통해 new를 사용하지 않고 우회하여 객체를 생성 할 수 있도록 함
	// 객체 생성을 하려면 메소드를 호출해야 하는데 생성 된 객체가 변수로 들어가게 됨 
	// 변수는 참조값을 참조만 해서 객체가 계속 생기지 않음
	// new 로 객체 생성을 안하는 방법이라고 생각하면 됨

}
