package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		System.out.println("-----------------------------------");
		// 출력 -> 사과 1개에서 남은 양: 0.29999999999999993
		// 실수연산은 정확하게 안나옴
		
	////////////////////////////////////////////////////////////////////
		
		int totalPieces = apple * 10;
		result = totalPieces - number;
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		// 정수연산으로 바꾸면 제대로 나와
		
	}

}
