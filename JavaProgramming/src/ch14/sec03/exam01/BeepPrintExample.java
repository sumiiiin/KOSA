package ch14.sec03.exam01;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// 작업1 ------------------------------------------------------스레드 따로 만들기
		 Thread thread = new Thread(new Runnable() {
			 
			@Override
			public void run() {
				// 아까 작성한 작업 내용 들어가기 
				for (int i=0; i<5;i++) {
					Thread curThread = Thread.currentThread();
					
					// 스레드가 작업 할 내용
					System.out.println("노래를 출력합니다.: " + curThread.getName());
					
					// 0.5초간 일시 정지, 0.5초간 머물러 있는다는 뜻
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace(); // 오류 출력하기 
					} // 스레드의 정적 메소드 Interrupted
			} 
		 }
		 }); // 괄오 주의 객체 생성에 오버라이딩 까지 다 들어가야 함
		 	
		 	thread.start();
		
		// 작업2 ------------------------------------------------------ 메인 스레드에서 처리하기
		 	Thread mainthread = Thread.currentThread();
		 	
		for (int i=0; i<5;i++) {
			// 스레드가 작업 할 내용
			System.out.println("가사 출력합니다." + mainthread.getName());
			
			// 0.5초간 일시 정지, 0.5초간 머물러 있는다는 뜻
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // 오류 출력하기 
			} // 스레드의 정적 메소드 InterruptedException예외 처리하라고 나옴
		}

	}

}
