package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // 메인 스레드에 join 
			// SumThread 먼저 출력 main이 기다려줬다가 끝나면 밑에 메인 스레드가 실행 됨
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("1부터 100까지의 합: " + sumThread.getSum());

	}

}
