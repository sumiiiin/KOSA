package ch06.sec08.exam02;

public class Computer {
	
	// Field 선언
	
	// Constructor 선언
	
	// Method 선언
	int sum1(int[] values) {
		int result = 0;
		
		for(int value : values) { // values에 있는 값을 순차적으로 변수 value에 넣는다.
			result += value;
		}
		return result;
	}
	
	int sum2(int ... values) { // 얘도 values가 배열이지만 그냥 int로 받아도 괜찮음 sum1은 안 됨
		int result = 0;
		
		for(int value : values) { // values에 있는 값을 순차적으로 변수 value에 넣는다.
			result += value;
		}
		return result;
	}
}
