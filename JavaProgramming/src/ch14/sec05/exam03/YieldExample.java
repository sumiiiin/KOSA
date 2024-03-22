package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB"); // 스레드 두개 만들기
		
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workThreadA.work = false; 
		// A만 무의미한 반복을 하게 함 else 처리로 무의미한 반복을 하지 않게 함
		// 그냥 보면 똑같아보이지만 A가 무의미한 반복을 하지 않아서 
		// B가 더 많은 실행기회를 가져가게 됨
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workThreadA.work = true;

	}

}

