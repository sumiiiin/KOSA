package ch07.sec05.exam02;

public class Car {
	// field 선언
	public int speed;
	
	// method
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() { // 최종적인 메소드로 재정의 안 됨 
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
