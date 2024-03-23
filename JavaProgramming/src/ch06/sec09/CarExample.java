package ch06.sec09;

public class CarExample {
	public static void main(String[] args) {
		
		System.out.println(Car.company);
		
		Car.info(); // info 메소드는 static이라서 객체 생성 없이 사용 가능하다
		
		Car myCar = new Car("G80");
		
		myCar.setSpeed(60);
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		
		myCar.runrun();
		myCar.run(); // 이거 정적 메소드인데 객체로 접근해서 경고 뜸
	}

}
