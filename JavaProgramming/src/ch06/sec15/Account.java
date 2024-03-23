package ch06.sec15;

public class Account {
	
	// 필드 선언
	private int balance;
	private static Account instance = new Account();
	
	// 생성자 선언	
	private Account() {
		
	}
	
	// 메소드 선언
	public void input(int amount) {
		balance += amount;
	}
	
	public void output (int amount) {
		balance -= amount;
	}
	
	public static Account getInstance() {
		return instance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	

}
