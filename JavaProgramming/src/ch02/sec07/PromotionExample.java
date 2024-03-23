package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 자동 형(타입) 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 변수 한번 선언하면 다시 선언 못함, 하지만 값을 바꿀 순 있으니까 그냥 값만 바꿈
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실수타입은 정수타입보다 많은 수를 저장 할 수 있어서 데이터 크기가 작아도 가능
		System.out.println(floatValue);
		/*리터럴을 직접 할당할 때는 리터럴 뒤에 F 또는 f를 붙여야 합니다. 
		그러나 변수에 값을 대입할 때는 타입 추론이 이루어지기 때문에 F를 붙이지 않아도 됩니다.*/
		
		floatValue = 100.5F; //F를 적어야 flaot로 인식함 안하면 더블로 인식
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		
		
	}

}
