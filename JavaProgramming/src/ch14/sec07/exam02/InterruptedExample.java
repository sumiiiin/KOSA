package ch14.sec07.exam02;


public class InterruptedExample {
	public static void main(String[] args) {
		
		PrintThread thread = new PrintThread(); // 프린트 스레드 객체 생성
		thread.start(); // 프린트 스레드 시작
		
		try {
			Thread.sleep(1000); // 메인스레드 일시정지
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(PrintThread.currentThread().getName()); 
		// 이거 왜 메인스레드뜨지? -> 프린트 스레드 이름 부르고 싶다고 부르는 기능이 아니었다.
		// currentThread() 메소드는 현재 실행 중인 스레드를 반환하는 정적메소드이다.
		// PrintThread를 사용하는건 의미가 없고 그냥 Thread로 호출하자

		
		thread.interrupt();// Thread 메소드인 interrupt 호출
	}

}
 