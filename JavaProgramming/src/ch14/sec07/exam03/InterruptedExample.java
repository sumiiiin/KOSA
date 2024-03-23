package ch14.sec07.exam03;

public class InterruptedExample {
	public static void main(String[] args) {
		
		Thread thread = new PrintThread();
		
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();// 메인스레드가 호출하네
	}

}
