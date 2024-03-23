package ch13.sec03.exam02;

public class GenericMethodByType {
	
	public <T> void introduce(T t) { // 매개값으로 들어오는 타입을 제네릭 타입으로 사용 하겠다.
		System.out.println("안녕하세요" + toString() + "입니다.");
	}

}
