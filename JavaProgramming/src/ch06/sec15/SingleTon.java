package ch06.sec15;

public class SingleTon {
	
	// 필드 선언
	private static SingleTon instance = new SingleTon(); 
	// 내부에서만 쓸 수 있는 메소드를 변수에 넣음 
	// 정적 선언도 필수인가? 
	
	// 생성자 선언
	private SingleTon() { // 외부에서 생성자 호출 못해
		// 객체를 만들었는데 내부에서만 쓸 수 있어
		
	}
	
	// 메소드 선언
	public static SingleTon getInstance() {
		return instance;
	}

}
// 필드와 생성자와 메소드의 관계성 확립시키기

// 인스턴스 메소드 안에..정적 필드와 정적 메소드 넣는거..별론가? 