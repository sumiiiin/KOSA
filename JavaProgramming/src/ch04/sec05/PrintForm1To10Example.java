package ch04.sec05;

public class PrintForm1To10Example {
	public static void main(String[] args) {
		
		int i = 1; // 변수 선언, 초기화
		
		while (i<=10) {	// 조건식이 true일 때 까지 반복한다.
			System.out.print(1 + " ");
			i++; // i의 값이 계속 1이면 while문이 영원히 반복되기 때문에 증감식을 넣어줬다.
		}
	}

}
