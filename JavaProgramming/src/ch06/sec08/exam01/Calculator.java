package ch06.sec08.exam01;

public class Calculator {
	
	// 필드 선언 -> 꼭 있을 필요는 없다. 필요하면 선언
	
	
	// 생성자 선언 -> 꼭 있을 필요는 없다. 기본 생성자가 자동으로 생김 필요하면 선언
	
	
	// 메소드 선언
	void powerOn() { // 반환 받을 값이 없어서 void, 실행만 할거야
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() { // 반환 받을 값이 없어서 void, 실행만 할거야
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴 값은 plus앞에 선언한 타입인 int타입이어야 한다.	
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y; 
		// double은 하나만 변환해도 결과값은 실수가 나와서 double에 담을 수 있긴 하다.
		return result;
	}

}
