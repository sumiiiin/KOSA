package ch06.check1;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account(); // 객체 생성
		
		account.setBalance(10000);
		System.out.println(account.getBalance() + "원 있습니다.");
		
		account.setBalance(-10000);
		System.out.println(account.getBalance() + "원 있습니다.");
		
		account.setBalance(2000000);
		System.out.println(account.getBalance() + "원 있습니다.");
		
		account.setBalance(300000);
		System.out.println(account.getBalance() + "원 있습니다.");
		

	}

}
