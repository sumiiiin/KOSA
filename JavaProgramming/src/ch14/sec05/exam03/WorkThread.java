package ch14.sec05.exam03;

public class WorkThread extends Thread{
	public boolean work = true;
	
	public WorkThread(String name) {
		setName(name); //Thread의 이름을 지어주는거 setter아냐 필드에 없잖아
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + "작업처리");
			} 
			else {
				Thread.yield();
			}
		}
	}

}
