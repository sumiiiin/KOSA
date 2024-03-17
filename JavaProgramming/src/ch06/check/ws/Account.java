package ch06.check.ws;

public class Account {
	private String name;
	private String accountNumber;
	private int balance;
	
	public Account(String name, String accountNumer, int money){
		this.name = name;
		this.accountNumber = accountNumer;
		deposit(money);
	}
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println(money + "원 입금하였습니다. (잔액:"+ balance +")");
	}

	public void withdarw(int money) {
		this.balance -= money;
		System.out.println(money + "원 출금하였습니다. (잔액:"+ balance +")");
	}

	public void accountInfo() {
		System.out.println(accountNumber + " " + name + " " + balance);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
}
