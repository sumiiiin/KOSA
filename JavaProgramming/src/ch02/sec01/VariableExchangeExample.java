package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 350;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		// 변수는 값이 바뀔 수 있고 변수의 값을 변수에 넣을 수 있다. 
		// 값을 서로 바꾸려면 하나의 값을 저장할 임시 저장소(변수)가 필요하다.

	}

}
