package ch14.sec07.exam02;

public class PrintThread extends Thread{
	
	
	public PrintThread() {
		
		setName("printThread");// 프린트 스레드 이름 셋팅
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); 
				// 프린트 스레드가 일시정지해서 interrupt
			}
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
