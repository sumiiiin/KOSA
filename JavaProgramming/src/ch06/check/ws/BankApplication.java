package ch06.check.ws;

import java.util.Scanner;

public class BankApplication {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account[] arr = new Account[100];
		int maxIndex = 0;
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			String choice = scanner.nextLine();
			System.out.println("---------------------------------");
			
			if(choice.equals("1")) {
				if(maxIndex >= arr.length) {
					System.out.println("계좌를 더 이상 생설 할 수 없습니다");
					continue;
				}
				
				System.out.println("계좌생성");
				System.out.println("---------------------------------");
				
				String accountNumber = isExist(arr, maxIndex);
				String name = isName();
				int money = isMoney(0);
				
				arr[maxIndex] = new Account(name,accountNumber, money);
				maxIndex ++;
			}else if(choice.equals("2")) {
				for(int i = 0; i < maxIndex; i++) {
					arr[i].accountInfo();
				}
			}else if(choice.equals("3")){
				int index = findAccount(arr, maxIndex);
				int money = isMoney(1);
				
				arr[index].deposit(money);
			}else if(choice.equals("4")){
				int index = findAccount(arr, maxIndex);
				
				while(true) {
					int money = isMoney(2);
					if (money <= arr[index].getBalance()) {
						arr[index].withdarw(money);
						break;
					}
					System.out.println("잔액이 부족합니다. 잔액보다 적은 금액을 입력해주세요(잔액:" + arr[index].getBalance() + ")");
				}
			}else if(choice.equals("5")) {
				break;
			}else {
				System.out.println("메뉴에 해당하는 번호를 입력해주세요(예: 계좌생성을 원하시면 숫자 1을 입력)");
			}
		}
	}

	static String isAccountNumber() {
		String message = "올바른 형식의 계좌번호를 입력해주세요.(예:000-000)";
		
		while(true) {
			System.out.print("계좌번호:");
			String accountNumber = scanner.nextLine();
			
			if(accountNumber.length() != 7) {
				System.out.println(message);
				continue;
			}
			
			String[] numbers = accountNumber.split("");
			
			if(!numbers[3].equals("-")) {
				System.out.println(message);
				continue;
			}
			
			boolean allNumber = true;
			for(int i=0; i<numbers.length; i++) {
				if(i==3) {
					continue;
				}
				
				if(!"1234567890".contains(numbers[i])) {
					System.out.println(message);
					allNumber = false;
					break;
				}
			}
			if(allNumber) {
				return accountNumber;
			}
		}
	}

	static String isName() {
		String message = "성 이름을 공백없이 입력해주세요(예:홍길동)";
		while(true) {
			System.out.print("계좌주:");
			String name = scanner.nextLine();
			
			if(name.length()<2) {
				System.out.println(message);
				continue;
			}
			
			return name;
		}
	}
	
	static int isMoney(int index) {
		String message = "100원 이상의 금액을 원을 붙이지 않고 입력해주세요(예:1000)";
		String[] moneyType = {"초기입금액", "예금액", "출금액"};
		
		while(true) {
			System.out.print(moneyType[index ]+ ":");
			String money = scanner.nextLine();
			
			if(money.length()<3) {
				System.out.println(message);
				continue;
			}
			
			String[] numbers = money.split("");
					
			boolean allNumber = true;
			for(int i=0; i<numbers.length; i++) {
				if(!"1234567890".contains(numbers[i])) {
					System.out.println(message);
					allNumber = false;
					break;
				}
			}
			if(allNumber) {
				return Integer.parseInt(money);
			}
		}
	}

	static String isExist(Account[] arr,int maxIndex) {
		String accountNumber;
		
		while(true) {
			accountNumber = isAccountNumber();
			
			boolean exist = false;
			for(int i = 0; i < maxIndex; i++) {
				if(arr[i].getAccountNumber().equals(accountNumber)){
					System.out.println("이미 존재하는 계좌번호입니다. 다른 번호로 다시 시도해주세요");
					exist = true;
					break;
				}
			
			}
			if(!exist) {
			return accountNumber;
			}
		}
	}
	
	static int findAccount(Account[] arr, int maxIndex) {
		int index = -1;
		
		while(index == -1) {
			String accountNumber = isAccountNumber();
			
			for(int i=0; i<maxIndex ;i++) {
				if(arr[i].getAccountNumber().equals(accountNumber)) {
					index = i;
					break;
				}
			}
			
			if(index == -1) {
				System.out.println("계좌번호에 해당하는 계좌가 존재 하지 않습니다. 확인 후 다시 입력해주세요");
			}
		
		}	
	return index;
	}
}
