package ch06.sec06.exam02;

public class Car {
	
	// 필드 선언 (객체에 포함되는 데이터 선언)
	// 객체가 생성되는 시점에 값이 저장
	String company = "현대자동차";
	String model ;
	String color ;
	int maxSpeed = 350;
	int speed;
	// 클래스로 객체를 만들 때(인스턴스화) 이 필드를 포함해야 한다.
	
	// 생성자 선언
	// 생성자 호출 시에 값이 입력 됨, 객체를 사용 할 때는 업데이트가 된 상태
	Car(){
		model = "그랜저";
		color = "검정";
	}
	
	// 메소드 선언
	void run() {
		speed = 60;
		
		
	// Car myCar = new Car(); 실행 클래스에서 선언시
	// myCar.model 출력 시 그랜저가 나옴
	// myCar.speed 출력 시 초기 값인 0이 나오지만
	// myCar.run(); 해서 메소드 실행 하면 60이 나옴
	}
}
