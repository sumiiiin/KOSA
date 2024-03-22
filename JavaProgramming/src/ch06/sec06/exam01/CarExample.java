package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car(); // myCar가 참조 변수
		
		// myCar 객체의 필드값 변경
		myCar.model = "그랜저";
		myCar.start = true;
		myCar.speed = 60;
		
		// Car 객체 내부의 데이터 읽기
		System.out.println(myCar.model); 
		// 외부 객체가 객체에 접근하기 위해 사용하는 도트연산자
		System.out.println(myCar.start); 
		// 도트 연산자는 객체연산자로 객체가 갖고 있는 필드나 메소드에 접근하고자 할 때 사용한다.
		System.out.println(myCar.speed);
		System.out.println();
		
		// Car 객체 하나 더 생성
		Car yourCar = new Car();
		
		// Car 객체 내부의 데이터 읽기
		System.out.println(yourCar.model);
		System.out.println(yourCar.start);
		System.out.println(yourCar.speed);
		
		System.out.println();
		System.out.println(myCar == yourCar);
	}

}
