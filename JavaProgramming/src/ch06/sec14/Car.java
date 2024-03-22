package ch06.sec14;

public class Car {
	
	// Field 선언
	private int speed; // 필드를 생성할 때는 일단 private로 선언해라
	private boolean stop;
	
	// Constructor 선언
	
	
	// Method 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		
	}
	public boolean isStop() {
		return stop;
		
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop) {
			this.speed = 0;
		}
		
	}
	

}
