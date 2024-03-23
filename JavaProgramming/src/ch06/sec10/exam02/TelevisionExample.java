package ch06.sec10.exam02;

public class TelevisionExample {
	// 필드 선언
	String writer = "홍길동";
	// 생성자 선언
	
	// 메소드 선언 -> 메인 메소드도 메소드야 -> 그치그치 -> 메인 메소드 있어도 설계도로 만들 수 있어 
	public static void main(String[] args) {
		System.out.println(Television.info);
		
//		System.out.println(writer);
		// 객체 생성 안해서 안됨, 메소드가 정적 메소드잖아
		
		TelevisionExample te = new TelevisionExample();
		System.out.println(te.writer);
		// 객체 생성해서 인스턴스 멤버 사용할 수 있다.
	}
}
// 이 파일 실행하면 실행 됨