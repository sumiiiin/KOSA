package ch13.sec02.exam03;

public class Box <T>{
	
	public T content;
	
	public boolean compare(Box<T> other) { 
		// 제네릭 타입은 일단 object이다. 그래서 타입이 지정되기 전에도 object의 메소드는 사용 할 수 있다.
		boolean result = content.equals(other.content);
		// 지금 객체의 content필드랑 매개값으로 들어온 객체의 content필드값이 같니?
		// content가 String으로 들어오면 .equals는 스트링 메소드로 재 정의 됨
		return result;
	}

}
