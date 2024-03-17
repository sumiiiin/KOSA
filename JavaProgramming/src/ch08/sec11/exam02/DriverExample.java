package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.drive(new Bus()); 
		// Vehicle로 사용가능한 객체 사용 가능(바로 객체 넣거나)
		
		Vehicle vehicle = new Taxi();
		driver.drive(vehicle); 
		// Vehicle로 사용가능한 객체 사용 가능(인터페이스 변수에 대입해서 넣거나)
		
		// 인터페이스 객체에 상관없는 클래스 대입 가능? 아닐거같긴 한데 해보기
		// 
		
		

	}

}
