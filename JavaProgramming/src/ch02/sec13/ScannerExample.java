package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in); 
//		// 기본 타입이 아니라 에러남 스캐너 클릭하고 import뭐 누르면 됨(ctrl + shift + o)
//		
//		String input = scanner.nextLine(); 
//		// 사용자가 enter를 누를 때 enter를 누르기 전까지의 값을 input에 저장한다.
		
//		System.out.println("입력한 내용: " + input); // (syso + ctrl + space)
		
		Scanner scanner = new Scanner(System.in);
		
		
				System.out.print("x 값 입력: ");
				String strX = scanner.nextLine(); // 값 입력
				int x = Integer.parseInt(strX); // 입력받은 문자열 숫자로 변환
				
				System.out.print("y 값 입력: ");
				String strY = scanner.nextLine();
				int y = Integer.parseInt(strY);
				
				int result = x + y;
				System.out.println("x + y: " + result); // 숫자 더해
				System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");// 개행 안하고 출력
			String data = scanner.nextLine(); // 사용자가 enter를 누를 때 enter를 누르기 전까지의 값을 input에 저장한다.
			if (data.equals("q")) { 	// data에 q라는 문자가 들어오면 true
				break;					// 멈춰라
			}
			System.out.print("출력 문자열: " + data);
			System.out.println();
			
		}
		
		System.out.println("종료"); //while문이 실행중일 때는 실행되지 않고 종료되면 출력되도록 밖에 적음 
		
	}

}
