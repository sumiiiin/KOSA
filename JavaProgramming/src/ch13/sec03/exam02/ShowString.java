package ch13.sec03.exam02;

public class ShowString {
	String name;
	
	public ShowString(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
