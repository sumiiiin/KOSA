package test.pb01;

import java.util.Scanner;

public class pb01 {

	public static void main(String[] args) {
		
//		자연수 N이 입력되면 “Hello MyCompany!”를 N번 출력하라.
//
//		입력방법
//		3
//		출력내용
//		Hello MyCompany!
//		Hello MyCompany!
//		Hello MyCompany!
/////////////////////////////////////////////////////////////////////////////////

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 N: ");
		
		// 스캐너로 받은 값 문자열 변수에 대입
		String n = sc.nextLine();
		
		// 스캐너로 받은 n을 int로 변환
		int num = Integer.parseInt(n);
		
		// for문을 num만큼 반복
		for (int i = 0; i < num; i++) {
			System.out.println("Hello MyCompany!");
		}


	}

}
