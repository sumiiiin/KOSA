package ch04.sec02;

public class IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20) + 81; //19 + 81 = 100, 81보다는 큰 수가 나오는 랜덤 값
		System.out.println("점수: " + score);
		
		String grade; // grade변수는 여러 블록에서 사용하기 때문에 if문 위에 선언하였다.
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}

}
