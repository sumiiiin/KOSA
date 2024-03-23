package ch03.sec11;

public class ConditoinalOperationExample {
	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + " 등급입니다.");
	}

}

//true or false 가 나오는 건 조건식이다.
// 연산 순서는 보기 쉽게 우선순위 인것을 괄호로 묶어라, 외우지 말어라