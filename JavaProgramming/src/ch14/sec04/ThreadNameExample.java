package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체의 참조 얻기
		System.out.println(mainThread.getName()+ "실행");
		
		for(int i =0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
			} // 세미콜론 붙이는거야 안 붙이는 거야
		};
		
		chatThread.setName("chat-thread");
		chatThread.start();
		
		
	}
	
}
