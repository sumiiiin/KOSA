package ch14.sec06.exam01;

public class SyncronizedExample {

	public static void main(String[] args) {
		
		//공유 객체 생성
		Calculator calculator = new Calculator();
		
		//스레드 객체 생성 
		User1Thread user1Thread = new User1Thread();
		
		//공유 객체를 User1Thread에 주입
		user1Thread.setCalculator(calculator);
		
		// User1Thread가 계산기를 먼저 사용
		user1Thread.start();
				
		
		// 스레드 객체 생성
		User2Thread user2Thread = new User2Thread();
		
		// 공유 객체를 User2Thread에 주입
		user2Thread.setCalculator(calculator);
		
		// User2Thread가 계산기를 나중에 사용
		user2Thread.start();

	}

}
