package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		
		try {
			account.withdraw(1000); // 얘는 예외 안나오는 값이지만 일반 예외이기 때문에 일단 호출 할 때마다 예외 처리를 해야 한다.
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 없어서 출력 안 나옴
		}
		System.out.println(account.getBalance()); // 올바르게 출금 함
		System.out.println();
		try {
			account.withdraw(10000);
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 있어서 예외 출력함
		}
		System.out.println(account.getBalance());

	}

}
