package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		// Box 클래스에서 타입 선언 안 한거 객체 생성할 때는 해야해
		// new 뒤에도 타입 적어야 하는데 앞에 적어서 안적어도 문제는 없음
		
		box1.content = "안녕하세요"; // 객체의 필드 값 접근
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		// 객체 생성할 때 어떤 타입이든 참조 타입이면 다 올 수 있어
		
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
