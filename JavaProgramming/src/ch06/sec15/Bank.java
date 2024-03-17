package ch06.sec15;

public class Bank {
	// 필드 선언
	private String branch;
	
	// 생성자 선언
	public Bank(String branch) {
		this.branch = branch;
	}
	
	// 메소드 선언
	public void deposit(int amount) {
//		Account account = new Account();
		Account account = Account.getInstance();
		account.input(amount);
	}
	
	public void withdraw(int amount) {
//		Account account = new Account(); // 새로운 객체 생성 
		// 내 통장에서 돈 빼야 하는데 돈 넣은 통장이랑 다른 통장(객체)이 된다.
		Account account = Account.getInstance();
		account.output(amount);		
	}
	
	public void balanceInfo() {
		Account account = Account.getInstance();
		System.out.println(account.getBalance());
	}
	

}
