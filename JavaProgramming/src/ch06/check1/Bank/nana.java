// 1차 문제만 푼거
package ch06.check1.Bank;

import java.util.Scanner;

public class nana {

	public static void main(String[] args) {
		
		// 변수 생성
		Scanner scanner = new Scanner(System.in);
		String accountNum = null;
		String name = null;
		int balance = 0;
		int count = 0;
		
		Account[] Account = new Account[100];
		
		// 생성자 호출 및 초기화
		Account accountObject = new Account(accountNum, name, balance);
		
		while (true) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴선택>");
			String select = scanner.nextLine();
			
			if (select.equals("1")) {
				System.out.println("---------------------------------------");
				System.out.println("계좌생성");
				System.out.println("---------------------------------------");
				
				System.out.print("계좌번호: ");
				accountNum = scanner.nextLine();
				System.out.print("계좌주: ");
				name = scanner.nextLine();
				System.out.print("초기 입금액: ");
				String strBalance = scanner.nextLine();
				balance = Integer.parseInt(strBalance);
				
				accountObject = new Account(accountNum, name, balance);
				
				Account[count] = accountObject;
				
				count++;
				
				System.out.println("계좌가 생성되었습니다.");
				
			} else if(select.equals("2")) {
				System.out.println("---------------------------------------");
				System.out.println("계좌목록");
				System.out.println("---------------------------------------");
				
				for(int i = 0; i<count; i++) {
					System.out.println(Account[i].accountNum+"     "+ Account[i].name+"     "+Account[i].balance);
				}
			} else if(select.equals("3")) {
				
				while (true) { // 계좌번호 유효성 검사 및 예금 기능
				System.out.println("---------------------------------------");
				System.out.println("예금");
				System.out.println("---------------------------------------");
				System.out.print("계좌번호: ");
				String acNum = scanner.nextLine();
				
				int index = -1; // -1로 초기화 해서 false값으로 사용
				
					for (int i = 0; i < count; i++) {
						if (acNum.equals(Account[i].accountNum)) {
							index = i; // 찾는 계좌 인덱스가 나옴
						}
					}
					if (index == -1) {
						System.out.println("잘못 입력하셨습니다.");
						System.out.println("처음으로 돌아가시려면 1번을 다시 입력하시려면 2번을 눌러주세요");
						System.out.print("선택> ");
						String yesOrNo = scanner.nextLine();
						if (yesOrNo.equals("1")) {
							break;
						} else if(yesOrNo.equals("2")) {
							
						} else {
							System.out.println("잘못 입력하셨습니다. 계좌번호를 다시 입력하세요");
						}
					} else { // 계좌가 있는 경우
						System.out.print("예금액을 입력하세요: ");
						String strDeposit = scanner.nextLine();
						int deposit = Integer.parseInt(strDeposit);
						Account[index].balance += deposit;
						System.out.println("현재 잔고: "+Account[index].balance);
						break;
					}
				} // while문 끝
								
			} else if(select.equals("4")) {
				
				while (true) { // 계좌번호 유효성 검사 및 출금 기능
					System.out.println("---------------------------------------");
					System.out.println("출금");
					System.out.println("---------------------------------------");
					System.out.print("계좌번호: ");
					String acNum = scanner.nextLine();
					
					int index = -1; // -1로 초기화 해서 false값으로 사용
					
						for (int i = 0; i < count; i++) {
							if (acNum.equals(Account[i].accountNum)) {
								index = i; // 찾는 계좌 인덱스가 나옴
							}
						}
						if (index == -1) {
							System.out.println("잘못 입력하셨습니다.");
							System.out.println("처음으로 돌아가시려면 1번을 다시 입력하시려면 2번을 눌러주세요");
							System.out.print("선택> ");
							String yesOrNo = scanner.nextLine();
							if (yesOrNo.equals("1")) {
								break;
							} else if(yesOrNo.equals("2")) {
								
							} else {
								System.out.println("잘못 입력하셨습니다. 계좌번호를 다시 입력하세요");
							}
						} else { // 계좌가 있는 경우
							System.out.print("출금액을 입력하세요: ");
							String strDeposit = scanner.nextLine();
							int deposit = Integer.parseInt(strDeposit);
							Account[index].balance -= deposit;
							System.out.println("현재 잔고: "+Account[index].balance);
							break;
						}
					} // while문 끝
				
			} else if(select.equals("5")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
		
	}

}
