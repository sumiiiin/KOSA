package ch04.sec03;

public class SwitchCharExample {
	public static void main(String[] args) {
		
		char grade = 'b';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");   
				break;
				// 조건 변수를 두개 달 수 있는 개념은 아니고 A가 먼저 일치하는지 확인하고 불일치해서 밑으로 넘어가는것이다.
				// 실행문이 없으니 실행문이 실행되진 않는다.
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
			// switch에 들어가는 변수는 정수 타입과 문자열 타입이 사용될 수 있다. 실수 타입은 안 된다.
	}

}
