package ch03.sec10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		
		result += 10; // result = result + 10;
		System.out.println("result: " + result);
		
		result -= 5; // result = result - 10;
		System.out.println("result: " + result);
		
		result *= 3; // result = result * 10;
		System.out.println("result: " + result);
		
		result /= 5; // result = result / 10;
		System.out.println("result: " + result);
		
		result %= 3; // result = result % 10;
		System.out.println("result: " + result);
		
		// 주석처럼 작성하는게 연산이 좀 더 많아서 미세한 속도차이가 나지만 아무렇게나 사용해도 좋다. 근데 알고는 있어야해
		
	}

}
