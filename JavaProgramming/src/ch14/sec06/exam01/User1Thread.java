package ch14.sec06.exam01;

public class User1Thread extends Thread{
	
	//Field
	private Calculator calculator; 
	// 공유 객체를 주입 할 필드 선언
	// 이 스레드는 Calculator에 의존하고 있음 
	// ->이 클래스를 사용하는데 Calculator가 필요하다.
	
	//Constructor
	public User1Thread() {
		setName("User1Thread"); // 객체 생성할 때 스레드 이름 정의
	}


	//method
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator; // 공유객체 받아올 setter
	}
	
	@Override
	public void run() { // thread 상속 받으면 run 오버라이딩 해야지
		calculator.setMemory(100); // 받아온 공유 객체 사용
	}

}
