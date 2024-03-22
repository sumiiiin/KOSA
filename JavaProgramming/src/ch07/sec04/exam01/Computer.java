package ch07.sec04.exam01;

public class Computer extends Calculator{
	
	// Field 선언
	
	//Constructor 선언
		
	//  Method 선언
	@Override
	public double areaCircle(double r) {
		System.out.println("PI적용(오버라이딩 됨)");
		return Math.PI * r *r;
	}

}
