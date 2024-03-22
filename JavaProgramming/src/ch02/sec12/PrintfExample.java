package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value); // 출력 - 상품의 가격: 123원
		System.out.printf("상품의 가격: %6d원\n", value); // 출력 - 상품의 가격:    123원
		System.out.printf("상품의 가격: %-6d원\n", value); // 출력 - 상품의 가격: 123   원
		System.out.printf("상품의 가격: %06d원\n", value); // 출력 - 상품의 가격: 000123원
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		// 변환 문자는 순서대로 들어가게 된다. 만약 순서대로 넣고 싶지 않다면 순서를 지정할 수 있다.
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
