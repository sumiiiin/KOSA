package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		double circleArea = 10 * 10 * Calculator.pi; // 클래스로 접근함
		int plusResult = Calculator.plus((int) circleArea, 5);
	}

}
