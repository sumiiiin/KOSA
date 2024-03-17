package ch11.sec06;

public class Account {
	// field 선언
	private long balance;
	
	// Constructor
	
	
	// method
	public long getBalance() { // 외부에서 호출 시 필드 값 가져온다.
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) throws InsufficientException {
		if(balance < amount) {
			throw new InsufficientException("잔고 부족");
		}
		
		balance -= amount; // 예외가 발생되면 실행되지 않는 문구
	}

}
