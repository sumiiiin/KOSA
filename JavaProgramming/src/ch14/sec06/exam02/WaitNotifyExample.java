package ch14.sec06.exam02;

public class WaitNotifyExample {
	public static void main(String[] args) {
		
		// 공유객체 생성
		WorkObject workObject = new WorkObject();
		
		// 두개의 스레드를 생성 할 때 공유 객체 주입
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		// 두개의 스레드 실행
		threadA.start(); 
		threadB.start();
	}

}
