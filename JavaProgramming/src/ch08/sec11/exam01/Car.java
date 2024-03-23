package ch08.sec11.exam01;

public class Car {
	
	// field선언
	public Tire tire1 = new HankookTire();
	public Tire tire2 = new HankookTire();
	// 인터페이스 타입에 클래스를 대입
	
	// method선언
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}

}
