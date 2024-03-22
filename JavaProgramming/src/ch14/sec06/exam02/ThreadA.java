package ch14.sec06.exam02;

public class ThreadA  extends Thread {
	
	private WorkObject workObject; // 필드로 공유 객체 받음 -> 내부에서 사용 할 목적
	
	public ThreadA(WorkObject workObject) { // 생성자
		setName("ThreadA"); // 스레드 이름 지정
		this.workObject = workObject;
	}
	
	@Override
	public void run() { // 스레드 실행
		for (int i=0; i<10000; i++) {
			workObject.methodA(); // 공유 객체의 메소드 만번 호출
		}
	}
}
