package ch08.sec11.exam01;

public class HankookTire implements Tire{

	@Override
	public void roll() {
		run();
		System.out.println("제동력이 좋은 한국타이어");
		
	}

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다.");
		
	}

}
