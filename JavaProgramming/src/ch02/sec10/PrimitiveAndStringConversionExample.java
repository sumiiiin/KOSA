package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// 문자열로 된 숫자를 숫자 타입으로 바꾸는 경우는 흔하다. 웹에서 사용자가 쓰는 값은 문자열로 오기 때문
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.01");
		boolean value3 = Boolean.parseBoolean("true");
		// 문자열을 숫자형으로 변경
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		// 숫자 출력
		System.out.println("""
				
				""");
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = "" + value1; // 문자열 결합을 이용한 변경
		// 숫자형을 문자형으로 변경
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		// 문자 출력

	}

}
