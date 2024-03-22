package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{ 
	// 타입이 객체? 제네릭 타입 있으면 사용 할 때 꼭 알려줘야해
	
	
	@Override
	public Home rent() { // 이 메소드는 객체를 리턴해? 리턴타입 선언해서 오버라이딩
		
		return new Home(); // 객체 생성해서 리턴하네
	}


}
