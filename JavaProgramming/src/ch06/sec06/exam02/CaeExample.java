package ch06.sec06.exam02;

public class CaeExample {
	public static void main(String[] args) {
		// 객체 생성 및 생성자 호출
		Car myCar = new Car(); 
		
		// 필드 값 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		// 메소드 호출
		myCar.run();
		
		// 메소드 호출 후 필드 값 읽기
		System.out.println(myCar.speed);
		

	}

}
