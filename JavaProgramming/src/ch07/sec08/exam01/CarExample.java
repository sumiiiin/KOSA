package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new Tire();
//		car.tire = new HankookTire();
//		car.tire = new KumhoTire();
		// 셋 다 들어감 
		// 코드는 같지만 어떤 타이어가 들어가느냐에 따라 결과가 달라...
		
		car.run();

	}

}
