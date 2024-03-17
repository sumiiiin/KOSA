package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		
		String grade = "B";
		// 교수님 픽 
		// Java11 이전 문법
		int score1 = 0; // 변수 값 초기화
		
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
//Java13부터 가능-----------------------------------------------------------------------
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		}; // 왜 중괄호 뒤에 세미콜론이 붙지? -> 변수 선언하고 뒤에 변수 값을 넣는것이기 때문에 세미콜론을 넣어야 함(세미콜론은 실행문의 끝맺음)
		System.out.println("score2: " + score2);
	}

}
