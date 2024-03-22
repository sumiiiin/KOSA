package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x+=0.1f) { 
			// 카운터 변수는 정수로 해라 실수는 값을 정확하게 표현 못 한다. 실행하면 9번만 실행 됨
			System.out.println(x);
		}
	}

}
