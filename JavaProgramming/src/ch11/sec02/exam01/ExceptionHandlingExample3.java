package ch11.sec02.exam01;

public class ExceptionHandlingExample3 {
	
	public static void printLength(String data) {
		
		if(data != null) { // 이건 예외처리가 아냐
			int result = data.length();
			System.out.println("문자 수: " + result);
			
		} else {
			System.out.println("null");
		}
		

	}

	public static void main(String[] args) {
		printLength(null);
		
		
		}

	}



