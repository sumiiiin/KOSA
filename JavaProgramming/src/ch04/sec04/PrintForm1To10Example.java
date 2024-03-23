package ch04.sec04;

public class PrintForm1To10Example {
	public static void main(String[] args) {
		
		for (int i = 1; i<=100; i++) {	//(초기화 변수; 조건식(true인 동안 실행); 증감식)
			// 증감식에는 세미콜론이 붙지 않는다.(구분자로 쓰나봐)
			// i는 1인데 10이하일 때까지 중괄호(실행문)를 실행한다. 중괄호를 실행하면 i는 1씩 늘어난다.
			// 증감식에는 보통 후위연산자 사용, i = i+2, i += 3...등등 이런것도 사용가능하다.
			System.out.print(i + " ");
			
		}
	}

}
