package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
//		Vehicle vehicle = new Vehicle();
//		driver.drive(vehicle);
		
//		Bus bus = new Bus();
//		driver.drive(bus);
		
		Texi texi = new Texi();
		driver.drive(texi); // 부모클래스 들어갈 자리에 자식 클래스 들어감 -> 자동 타입변환
		
		driver.drive(new Bus()); // 위에 두줄이랑 똑같음

	}

}
