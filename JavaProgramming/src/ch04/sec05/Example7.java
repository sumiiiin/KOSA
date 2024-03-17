package ch04.sec05;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 스캐너 기능 변수에 담기
		int money = 0; // 변수 초기화

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------"); 

			System.out.print("선택 > "); // if문 전체에 해당하는 출력이기 때문에 반복문에 작성
			String strNum = scanner.nextLine(); // 기능을 호출하는 번호를 담을 변수

			if (strNum.equals("1")) { // strNum이 1이면
				System.out.print("예금액>"); // 개행 x
				String deposit = scanner.nextLine(); // deposit변수에 예금할 금액 적기 -> 숫자만 들어오게 설정은 어떻게 하지? parseInt?
				money += Integer.parseInt(deposit); // depotsit변수에 들어온 숫자를 정수로 변환하여 money변수에 더하기

			} else if(strNum.equals("2")) { 
				System.out.print("출금액>");
				String withdraw = scanner.nextLine();
				int min = Integer.parseInt(withdraw);
//				money -= min; // withdraw변수에 들어온 숫자를 정수로 변환하여 money변수에 빼기
//				// 통장에 돈이 없는데 돈이 출금되면 안돼 -> 기능 추가 해보기
				
				if (min<=money) {
					money -= min;
				} else {
					System.out.println("출금액이 보유금액보다 큽니다. 다시 입력하세요");
				}

			} else if(strNum.equals("3")) {

				System.out.println("잔고액>"+money); // money출력

			} else if(strNum.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("올바른 값을 입력하세요");
			}
		}
	}

}


