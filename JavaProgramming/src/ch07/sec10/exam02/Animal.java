package ch07.sec10.exam02;

public abstract class Animal {
	
	//field
	String color;
	String kind;
	
	// Constructor
	public Animal(String kind, String color) { // 순서바꿨더니 종이랑 색이 바뀜
		this.color = color;
		this.kind = kind;
	}
	
	//method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
