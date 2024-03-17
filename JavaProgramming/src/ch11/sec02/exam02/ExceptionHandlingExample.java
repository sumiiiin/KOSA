package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		// 일반 예외 예제
		
		try {
			Class.forName("java.lang.ReflectiveOperationException"); 
			// 존재하는 클래스, 존재하는데 왜 예외처리 해야해? 
			// -> 컴파일러는 얘가 존재하는지 안 하는지도 모르는데 예외가 날 수 있으니 예외처리 하라고 한대 즉, 일반예외가 발생한단 말
			// 값을 잘못 입력한걸 컴파일러상에서 걸러주는게 일반예외 아님?
			// forName같은 실행 시에 컴파일을 동적으로 로드하는 리플랙션이란 기능이 있는 애들만 그렇대 참나 내가 봐준다...
			
//			Class.forName("java.lang.String2"); // 존재 하지 않는 클래스
			System.out.println("해당클래스가 존재합니다.");// 
		} catch (ClassNotFoundException e) { // 일반 예외
			System.out.println("해당 클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

	}



