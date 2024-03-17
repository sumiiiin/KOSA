package ch04.sec03;

public class Example2 {
	public static void main(String[] args) {
			
			String grade = "B";
			
			int score1 = 0; // 초기화
			
			switch (grade) {
			case "A" -> {
				score1 = 100;
			} // 중괄호가 break역할을 한다.
			case "B" -> {
				int result = 100 - 20;
				score1 = result;
			}
			default -> {
				score1 = 60;
			}
			}
			
			System.out.println(score1);
	}

// 기존의 코드 표현식으로 바꾸는 문제
}
	
