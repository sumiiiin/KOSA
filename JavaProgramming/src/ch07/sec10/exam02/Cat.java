package ch07.sec10.exam02;

public class Cat extends Animal{
	
	// field
//	String color;
//	String kind;
	
	public Cat(String kind, String color) {
		super(kind, color);
	}
	
//	public void breathe() {
//		System.out.println("숨을 쉽니다.");
//	}
	
	@Override
	public void sound() {
		System.out.println("야옹~");
		
	}
	
	public void catchMouse() {
		System.out.println("쥐를 잡습니다.");
	}
	

}
