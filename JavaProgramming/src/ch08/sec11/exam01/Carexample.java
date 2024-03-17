package ch08.sec11.exam01;

public class Carexample {

	public static void main(String[] args) {
		
		// 자동차 객체 생성
		Car myCar = new Car();
		
		// 자동차를 달리게 합니다.
		myCar.run();
		// 금호랑 한국 둘 다 굴러간다고 호출됨
		System.out.println();
		
		myCar.tire1 = new KumhoTire();
		
		myCar.run();
		
		// 이번에 금호타이어만 두번 굴러감...왜?
 
	}

}
