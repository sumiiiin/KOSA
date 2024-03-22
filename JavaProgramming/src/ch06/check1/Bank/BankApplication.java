package ch06.check1.Bank;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		// 변수 생성
		Scanner scanner = new Scanner(System.in); // 스캐너
		String accountNum = null; // 계좌번호
		String name = null; // 계좌주
		int balance = 0; // 잔고
		int count = 0; // 계좌의 갯수
		
		Account[] Account = new Account[100]; // 계좌 객체를 관리할 배열
		
		// 생성자 호출 및 초기화
		Account accountObject = new Account(accountNum, name, balance); // 매개변수는 미리 초기화
		
		while (true) { 
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴선택>");
			String select = scanner.nextLine(); // 메뉴 선택 받을 스캐너
			
			if (select.equals("1")) { 
				System.out.println("---------------------------------------");
				System.out.println("계좌생성");
				System.out.println("---------------------------------------");
				
				boolean ox = true;
				
				while(ox) { // 계좌번호 유효성 검사
					System.out.print("계좌번호: ");
					String an = scanner.nextLine();
					
				
					if(an.equals("")) { // 빈 문자 검사
						System.out.println("다시 입력하세요");
						continue;
					}
					
					
					boolean duplicate = false; // 중복 계좌번호 검사
					for (int i = 0; i<count; i++) {
						if(an.equals(Account[i].accountNum)){ // 같은 계좌번호가 이미 있으면
							System.out.println("이미 있는 번호입니다. 다시 입력하세요");
							duplicate = true; 
							break; // for문을 빠져나가 while문으로 돌아감
						} 
					}
					
					if(!duplicate) {
						accountNum = an;
						ox = false;
						
					}
					
				}
				
				while (true) {
					System.out.print("계좌주: ");
					String nm = scanner.nextLine();
					
					if(nm.equals("")) { // 빈 문자열 유효성 검사
						System.out.println("다시 입력하세요");
						continue;
					} else {
						name = nm;
						break;
					}
				
				}
				
				while(true) {
					System.out.print("초기 입금액: "); 
					String strBalance = scanner.nextLine();
					
					if(strBalance.equals("")) { // 빈 문자열 유효성 검사
						System.out.println("다시 입력하세요");
						continue;
						
					} else {
						balance = Integer.parseInt(strBalance);
						break;
					}
					
				
				}
				
				accountObject = new Account(accountNum, name, balance); // 계좌 객체 생성
				
				Account[count] = accountObject; // 0부터 인덱스 순서대로 넣기
				
				count++; // 생성되면 count 1씩 증가
				
				System.out.println("계좌가 생성되었습니다.");
				
			} else if(select.equals("2")) {
				System.out.println("---------------------------------------");
				System.out.println("계좌목록");
				System.out.println("---------------------------------------");
				
				for(int i = 0; i<count; i++) {
					System.out.println(Account[i].accountNum+"           "+ Account[i].name+"          "+Account[i].balance);
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
					if (index == -1) { // 찾는 값이 없으면 index는 여전히 -1
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
						
						String strDeposit; 
						
						while(true) { // 예금액 유효성 검사
							System.out.print("예금액을 입력하세요: ");
							strDeposit = scanner.nextLine();
							if(strDeposit.equals("")) {
								System.out.println("다시 입력하세요");
								continue;
							} else {
								break;
							}
						}
						
						int deposit = Integer.parseInt(strDeposit);
						
						if(deposit < 0) { // 예금액이 마이너스인걸 방지
							System.out.println("0보다 작은 금액은 예금할 수 없습니다.");
							deposit = 0;
							// 계좌번호부터 다시 작성
						} else {
							Account[index].balance += deposit;
							System.out.println("현재 잔고: "+Account[index].balance);
							break;
						}
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
							
							String strWithdraw;
							while(true) {
								System.out.print("출금액을 입력하세요: ");
								strWithdraw = scanner.nextLine();
								if(strWithdraw.equals("")) {
									System.out.println("다시 입력하세요");
									continue;
								} else {
									break;
								} 
							}
							int withdraw = Integer.parseInt(strWithdraw);
							if(withdraw < 0) {
								System.out.println("0보다 작은 값은 입력 할 수 없습니다.");
								withdraw = 0;
							} else if(withdraw > Account[index].balance) {
								System.out.println("잔고보다 큰 금액은 출금 할 수 없습니다.");
							} else {
								Account[index].balance -= withdraw;
								System.out.println("출금이 성공하였습니다.");
								System.out.println("현재 잔고: "+Account[index].balance);
								break;
							}
							
						}
					 // while문 끝
				}
			} else if(select.equals("5")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
		
	}

}
