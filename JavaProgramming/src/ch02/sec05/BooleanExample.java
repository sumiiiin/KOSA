package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		// True or False 는 1bit만 있어도 되지만  1byte를 사용한다.
		
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

	}

}
