package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency(); // 집 대여해주는 구현 객체 생성
		Home home = homeAgency.rent(); // home객체 생성하는 메소드 호출 -> 집 만들기
		home.turnOnLight(); // home에서의 불 끄는 메소드 실행 -> 집 사용 

		CarAgency carAgency = new CarAgency(); // 차 대여해주는 구현 객체 생성
		Car car = carAgency.rent(); // car객체 생성하는 메소드 호출 -> 차 만들기
		car.run(); // car에서의 달리는 메소드 실행 -> 차 사용
		

	}

}
