package ch07.sec10.exam02;

public class Dog extends Animal{
	
	// field
//	String color;
//	String kind;
	
	public Dog(String kind, String color) {
		super(kind, color);
	}
	
//	public void breathe() {
//		System.out.println("숨을 쉽니다.");
//	}
	
	@Override
	public void sound() {
		System.out.println("왈~");
		
	}
	
	public void keepHouse() {
		System.out.println("집을 지킵니다.");
	}
	

}
