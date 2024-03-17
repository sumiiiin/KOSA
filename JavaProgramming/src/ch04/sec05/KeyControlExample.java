package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true; // 전역변수: 클래스변수 인스턴스변수가 있는데 이건 인스턴스인듯, 파일 전체에서 사용가능
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.종속 | 2.감속 | 3.중지");
			System.out.println("-------------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine(); //지역변수 괄호안에서만 사용 가능, 괄호안의 실행문이 실행 될 때만 존재하기 때문에 메모리 부담이 전역변수보단 적다.
			// 전역변수와 지역변수는 변수가 어디서 사용되는지에 대한 의미도 담고 있기 때문에 구분해주는것이 좋다.
//			String strNum = "1";
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) {
				run = false; // while문 종료하기 위한 장치
				// break랑 다른 점은 break는 while문을 완전 빠져나오지만
				// false는 다시true로 바꿀 수도 있기 때문에? 사용자의 편의에 맞춰 while문을 다시 실행할 여지가 있다.
			} else {
				System.out.println("다시 입력하세요");
			}
		} 
		
		System.out.println("종료"); // 최대 속도 출력하는 로직을 짤 수 있을까?
		// 문자열을 비교할 때는 "=="가 아니다 equals를 사용해라
	}

}
