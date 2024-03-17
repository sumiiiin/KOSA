package ch01.sec12;

// 클래스 선언
public class Calculator {
	// main 메소드 선언
	public static void main(String[] args) {
		
		int x = 1; // 메모리에 변수 저장
		
		int y; // 변수 선언
		y = 2; // 초기값 대입(프로그래밍에서 '='은 값을 대입 할 때 쓴다.) 
		
		// x처럼 선언,대입 해도 되고 y처럼 해도 됨
		// 값을 안 넣고 선언한 변수를 사용하면 오류난다 초기값 설정 해야 함
		
		int result = x + y;
		System.out.println(result);

	}

}
