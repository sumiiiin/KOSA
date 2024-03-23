package ch14.sec07.exam03;

public class PrintThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중");
				if(Thread.interrupted()) { 
				// 실행 할 때마다 공유메소드에서 interrupt 호출이 있는지 확인한다.
					break;
				}
			}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
			
		
		
	}
}
