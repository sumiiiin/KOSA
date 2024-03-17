package ch06.check1.Bank;

public class Account {
	
	// 필드 선언
	String accountNum;
	String name;
	int balance;
	
//	// getter, setter
//	int deposit;
//	int withdraw;
	


	// 생성자 선언
	Account(String accountNum, String name, int balance){
		
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	
	// 메소드 선언
//////////////////////////////////////////////////////////////////////
//	
////public String getAccountNum() {
////return accountNum;
////}
//
//public void setAccountNum(String accountNum) {
//	if (accountNum.equals("")) {
//	System.out.println("값을 입력해 주세요");
//	
//	} else {
//	this.accountNum = accountNum;
//	}
//
//}
//
////public String getName() {
////return name;
////}
//
//public void setName(String name) {
//	if (name.equals("")) {
//	System.out.println("값을 입력해 주세요");
//	} else {
//	this.name = name;
//	}
//}
//
////public int getBalance() {
////return balance;
////}
//
//public void setBalance(int balance) {
//this.balance = balance;
//}
//	
//	
//////////////////////////////////////////////////////////////
//	// 입금
//	public int getDeposit() {
//		
//		this.balance += deposit;
//		return deposit; // 혹시 입금액도 계속 더해지는건 아니겠지..아닐거같긴 한데 
//	}
//
//	public void setDeposit(int deposit) { 
//		// 유효성 검사 (숫자)
//		if (0 >= deposit) {
//			System.out.println("0보다 큰 값만 입금 할 수 있습니다.");
//		} else {
//			this.deposit = deposit;
//		}
//	}
//	
//	public void setDeposit(String z) { 
//		// 유효성 검사(문자) -> 문자와 빈 값을 검사
//		System.out.println("숫자를 입력해 주세요");
//	}
//	
//
//	public int getWithdraw() {
//		
//		this.balance -= withdraw;
//		return withdraw;
//	}
///////////////////////////////////////////////////////////////////////////
//	//출금 메소드
//	public void setWithdraw(int withdraw) {
//		// 잔고보다 큰 금액 인출 막기
//		if(balance < withdraw) {
//			System.out.println("잔고보다 큰 금액은 출금 할 수 없습니다.");
//		} else {
//			this.withdraw = withdraw;
//		}
//	}
//	
//	public void setWithdraw(String z) {
//		System.out.println("숫자를 입력해 주세요");
//	}
	

	
	
	
	
}



