package ch14.sec03.exam02;

public class MusicThread extends Thread{ //Runnable로 사용 가능한 MusicTask 
	
	@Override
	public void run() {
		
		// 아까 작성한 작업 내용 들어가기 
		for (int i=0; i<5;i++) {
			// 스레드가 작업 할 내용
			System.out.println("노래를 출력합니다.");
			
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
