package ch06.sec07.exam04;

public class Car {
	
	// 필드 선언
	String company = "현대자동차"; // 현대자동차에서 만드는 자동차는 다 현대자동차니까 값 입력
	String model; // 바뀔 수 있음
	String color; // 바뀔 수 있음
	int maxSpeed; // 바뀔 수 있음
	
	// 생성자 선언
	Car(){} // 클래스 기본값대로만 생성, company값만 있음
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color; 
		// this는 같은 변수 이름을 사용 할 때 이 클래스 파일이 갖고 있는 변수라는 뜻
	}
	
//	Car(String color, String model){
//		this.model = model;
//		this.color = color; 
//		// 매개 변수의 타입, 개수, 타입의 순서가 같으면 오버로딩 할 수 없음
		// 매개변수에 (str, str, int) 들어가고 (int, str, str)이 들어가면 오버로딩 가능
//	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		}
	Car(String model, int maxSpeed, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
