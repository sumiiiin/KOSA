package ch08.sec11.exam01;

public class KumhoTire implements Tire{

	@Override
	public void roll() {
		run();
		System.out.println("승차감이 좋은 금호타이어");
		
	}

	@Override
	public void run() {
		System.out.println("금호 타이어가 굴러갑니다.");
		
	}

}
