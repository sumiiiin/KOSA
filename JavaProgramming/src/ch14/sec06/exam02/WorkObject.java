package ch14.sec06.exam02;

public class WorkObject {// 공유클래스
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread(); // 스레드의 정보 객체를 스레드에 담아
		System.out.println(thread.getName() + ": methodA작업 실행");// 그 중 이름 반환
		notify(); // 일시정지한 상대방을 깨운다(실행대기상태로 만든다.)
		// 여기서 "상대방"이라 함은 현재 객체에 대해 
		// wait() 메서드를 호출하여 대기 중인 다른 스레드를 의미함.
		try {
			wait(); // 그리고 나는 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 메소드의 이름을 반환하고 상대방을 깨우는 메소드 두개 만듦
	// 각각의 스레드가 다른걸 출력해야 작동방식을 눈으로 볼 수 있기 때문이다.
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB작업 실행");
		notify();// 상대방을 깨운다(상대방을 실행대기상태로 만든다.)
		try {
			wait(); // 그리고 나는 일시 정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
