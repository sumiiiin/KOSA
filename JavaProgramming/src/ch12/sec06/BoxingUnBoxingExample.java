package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing
		Integer obj = 100;
		System.out.println("value" + obj.intValue()); 
		System.out.println("value" +obj); 
		//객체와 문자열을 더하면 객체를 toString한것과 같이 되어 문자열 결합이 된다.
		// 언박싱 안 됨
		
		//UnBoxing
		int value = obj;
		System.out.println("value" + value);
		
		// 연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result" + result);

	}

}
