package ch06.sec07.exam05;

public class Car {
	
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car(String model) {
		this(model, "은색", 250); // 1. 아래에 생성자 안 만들어서 일단 오류남
		// 추가적인 실행문 
	}
	
	Car(String model, String color){
		this(model, color, 250);
		// 추가적인 실행문 
	}
	
	Car(String model, String color, int maxSpeed) {
		// 2. 여기까지 내용 없이 선언만 해도 빨간 줄 지워 짐
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; 
	}
	
	// 총 3개의 생성자 선언

}
