package ch06.check1;

public class Account {
	
	// 필드 선언
	int balance;
	
	// 정적 상수 초기화 -> 초기화 안하면 오류, 정적 블록을 통해서라도 해야 한다.
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	// 생성자 선언
	Account(){ // 기본 생성자
		
	}
	
	// 메소드 선언 getter과 setter
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			balance = 0;
			// 아무것도 안 넣으면 되나?
		}
		
	}

}
