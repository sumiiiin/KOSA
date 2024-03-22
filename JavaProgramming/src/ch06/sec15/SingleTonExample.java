package ch06.sec15;

public class SingleTonExample {
	public static void main(String[] args) {
		
//		Singleton st = new Singleton(); // 외부 객체라서 못 만들어 
		
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		// 객체를 계속 생성하는게 아니라 메소드를 통해 객체를 참조하는 번지를 받아서 
		// 같은 객체를 변수명만 다르게 해서 받는 것이다.
		// 객체를 얻을 수는 있지만 계속 생성하지는 못하게 만듦 단 한개만 생성 할 수 있어 
		
		// 모든 패키지 모든 소스파일에서 단 하나만 생성 할 수 있는 싱글톤 객체!
	}
}
