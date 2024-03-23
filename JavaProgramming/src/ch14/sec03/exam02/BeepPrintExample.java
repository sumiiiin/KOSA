package ch14.sec03.exam02;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// 작업1 ------------------------------------------------------스레드 따로 만들기
		 
		Thread thread = new MusicThread(); 
		thread.start(); // start메소드 호출
		
		// 작업2 ------------------------------------------------------ 메인 스레드에서 처리하기
		
		for (int i=0; i<5;i++) {
			// 스레드가 작업 할 내용
			System.out.println("가사 출력합니다.");
			
			// 0.5초간 일시 정지, 0.5초간 머물러 있는다는 뜻
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // 오류 출력하기 
			} // 스레드의 정적 메소드 InterruptedException예외 처리하라고 나옴
		}

	}

}
