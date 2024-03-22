package ch07.sec05.exam02;

public class SportsCar extends Car{
	
	// method
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	public void stop() { 
//		// 이미 부모가 가진 메소드라 재정의 안됨 같은 이름의 메소드 생성 안됨!
//		speed = 0;
//	}
	

}
