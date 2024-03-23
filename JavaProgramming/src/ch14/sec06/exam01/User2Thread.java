package ch14.sec06.exam01;

public class User2Thread extends Thread{
	
	//Field
	private Calculator calculator; 
	
	//Constructor
	public User2Thread() {
		setName("User2Thread");
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() { // thread 상속 받으면 run 오버라이딩 해야지
		calculator.setMemory(50);
	}

}
