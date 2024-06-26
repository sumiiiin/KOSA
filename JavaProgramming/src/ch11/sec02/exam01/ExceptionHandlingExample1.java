package ch11.sec02.exam01;

import java.nio.channels.UnresolvedAddressException;
// 오류도 객체라서 사용하려면 import해야함 

public class ExceptionHandlingExample1 {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);

	}

	public static void main(String[] args) {
		
//		String name = null;
//		int result = name.length();
//		System.out.println("문자 수: " + result); // 예외가 try안에 없으면 예외처리 할 수 없음 
		
		
		try {
			System.out.println("[프로그램 시작]\n");
			
			String name = null;
			int result = name.length(); // NullPonterException 오류가 남
			
			System.out.println("문자 수: " + result); 
			// 오류 실행문 아래의 실행문은 실행되지 않음 catch로 넘어감(만약 catch에 없으면 걍 오류 남)
			System.out.println("프로그램 종료");
			printLength(null);
		
		} catch(NullPointerException e) { // try를 실행 할 때 NullPonterException이 발생하면 괄호 안을 실행해
			System.out.println("예외 처리 합니다.");
			
		} catch(UnresolvedAddressException e) { // catch는 여러개 작성 할 수 있다.
			
		} finally { // 넣어도 되고 안 넣어도 되지만 예외가 있던 없던 항상 실행 된다.
			System.out.println("프로그램 종료");
		}
		
//		printLength("this is java");
//		printLength(null);
		
		}

	}



