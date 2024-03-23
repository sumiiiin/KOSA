package ch06.sec10.exam01;

public class Calculator {
	
	// 필드 선언
	static double pi = 3.14159; // 변하지 않을 값은 static으로 정의하자
	
	
	// 메소드 선언
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x-y;
		// 메소드 실행블록에 인스턴스 멤버가 없으면 static으로 하는게 관례, static 할 수 있으면 static으로 하란 말이구만
		// 정적 메소드 실행문 안에 인스턴스 멤버가 있으면 정적 멤버로 못 만들어
	}

}
