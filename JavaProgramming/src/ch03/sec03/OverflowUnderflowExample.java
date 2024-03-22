package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {

		double a = 50;
		float b = 50;
		
		boolean c = a == b;
		System.out.println(c); //true
		
		boolean d = 0.1f == 0.1;
		System.out.println(d); //false
	}
}
