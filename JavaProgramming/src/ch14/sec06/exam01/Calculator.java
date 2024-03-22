package ch14.sec06.exam01;

public class Calculator {// 공유객체라고 따로 선언하는건 없고 공유해서 쓰면 공유객체다.
	
	//Field -> 일반적으로 공유 객체는 필드를 선언하면 동기화 기능을 사용한다. 
	// 동시에 값을 변경하면 올바른 값이 안 들어갈 수도 있어서
	private int memory;
	
	
	
	//Constructor 기본 생성자만 있음

	
	//Method
	public void setMemory(int memory) {
		synchronized(this) { // 블럭 안의 실행문은 동기화 되어 있다.
			this.memory = memory; // 필드 값 받아오기
			
			try {
				Thread.sleep(2000); // setMemory 호출한 스레드 일시 정지 시킴
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
			// .currentThread()는 스레드의 정보이고 .getName()은 그 중에 이름을 호출하는 메소드이다.
			// setMemory를 호출한 스레드의 정보가 나온다.
		}
	}
	
	


}
