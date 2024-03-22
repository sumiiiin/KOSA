package ch13.sec03.exam02;

public class ShowInteger {
	int number;
	
	public ShowInteger(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.valueOf(number);
	}

}
