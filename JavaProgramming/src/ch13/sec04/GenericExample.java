package ch13.sec04;

public class GenericExample {
	
	// 제한된 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		// T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", "+ t2.getClass().getSimpleName()+")");
		
		// Number 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue(); // 리턴값으로 기본타입 double타입을 리턴한다.
		return (v1 == v2);
	}

	public static void main(String[] args) {
		// 제네릭 메소드 호출
		boolean result1 = compare(10, 20); // T를 참조타입인 Integer타입으로 대체 -> 자동박싱
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5); //T를 참조타입인 Double타입으로 대체
		System.out.println(result2);

	}

}
