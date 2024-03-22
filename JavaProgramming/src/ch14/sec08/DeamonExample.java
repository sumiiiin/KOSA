package ch14.sec08;

public class DeamonExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true); // 메인이 죽으면 죽어
		ast.start(); 
		// 이건 다른 스레드니까 메인이 죽어도 원래는 안 죽어 데몬 스레드로 하니까 죽는거다.
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("메인 스레드 종료"); 
		// main은 반복문이 아니니까 실행문이 끝나면 스레드가 끝이 난다.

	}

}
