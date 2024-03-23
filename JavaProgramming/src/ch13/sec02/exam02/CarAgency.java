package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{
	// Car클래스로 제네릭 타입 선언 
	
	@Override
	public Car rent() { // 타입 선언 해서 오버라이딩
	
		return new Car();
	}

}
