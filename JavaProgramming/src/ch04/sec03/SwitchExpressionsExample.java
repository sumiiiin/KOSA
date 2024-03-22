package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
			case 'A','a' -> {
				System.out.println("우수 회원입니다.");   
			}	// A이거나 a라면 실행문을 실행해
			case 'B','b' -> {
				System.out.println("일반 회원입니다.");   
			}
			default -> {
				System.out.println("손님입니다.");
			}
	}	// Java 12이후부터 사용할 수 있는 switch 표현식이다.
		// 중괄호가 실행범위를 지정하기 때문에 break문을 쓰지 않아도 된다.
		
		switch (grade) {
		case 'A','a' -> System.out.println("우수 회원입니다.");
		case 'B','b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("회원이 아닙니다.");
		}
	}

}
