package ch06.sec08.exam03;

public class Carexample {

	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();
		
		//메소드 호출
		myCar.setGas(5); // 가스 주입
		
		if(myCar.isLeftGas()) { 
			// myCar.isLeftGas()은 리턴값이 boolean이라서 조건식에 사용 가능 
			System.out.println("출발합니다.");
		}
		
		myCar.run(); // 주행을 하면 가스가 닳고 멈추는 메소드
		
		System.out.println("gas를 주입하세요");

	}

}
