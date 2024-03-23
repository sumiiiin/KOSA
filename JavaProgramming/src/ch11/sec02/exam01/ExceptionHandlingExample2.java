package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
			System.out.println();
			
		} catch(NullPointerException e) { // e에는 try에서 발생 된 예외 객체가 대입이 된다.
			System.out.println("null입니다.");
			System.out.println("e에 대입된 예외 객체의 내용: " + e.getMessage()); // 예외가 발생 된 이유 출력
			System.out.println("---------------------");
			System.out.println(e.toString()); // 예외의 정보를 반환하는데 getMessage보다 자세하게 나옴 이유와 예외 정보까지 나옴
			System.out.println("---------------------");
			e.printStackTrace(); // 예외가 어디서부터 발생하고 예외 정보, 이유까지 다 나옴
			
		} finally {
			System.out.println("메소드 마무리 실행");
		}
		

	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		printLength(null);
		System.out.println();
		
		printLength("this is java");
		System.out.println();
		
		System.out.println("프로그램 끝");
		
		}

	}



