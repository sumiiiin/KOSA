package ch13.sec03.exam01;

public class GenericExample {
	
	public static <C> Box<C> boxing(C c) { 	// 매개 값을 받아서 타입 정할거야 
		// public static <C>->(제네릭 선언) Box<C>->(리턴타입) boxing(C c)->(매소드와 매개변수) {
		// Box<C>: 여기서 Box는 제네릭 클래스이며, C 타입의 객체를 포장합니다.
		// 즉, boxing 메서드는 제네릭 타입 C의 객체를 포장한 Box 객체를 반환합니다.
		
//		Box box = new Box<>(); // 이렇게 쓰면 안돼 그래서 그것도 제네릭으로 줘
		Box<C> box = new Box<C>();
		box.set(c); 
		return box;
		// 타입 정해줘야해 -> 아직 몰라 -> 그것도 모른다고 써야해 -> 매개변수로 타입을 받을거야
		
	}
	
	public static void main(String[] args) {
		
//		Box <String> box = new Box();
//		box.set("문자열");
//		System.out.println(box.get());
		
		Box<String> box1 = boxing("abc");
		System.out.println(box1.get());
		
		boxing(100); // 100이 Integer로 바뀌어서 메소드에 들어감
		System.out.println(boxing(100).get());
		
	
		
	}

}
