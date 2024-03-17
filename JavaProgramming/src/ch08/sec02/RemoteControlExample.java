package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 리모콘 변수 선언
		RemoteControl rcTv; // 인터페이스 변수를 선언
		RemoteControl rcAudio; // 인터페이스 변수를 선언 -> 계속 선언 할 수 있구만
		// 하나만 선언하고 객체바꾸는것도 가능
		
		// 리모콘과 연결된 객체 대입
		rcTv = new Television(); // 인터페이스와 연결하는 작업...? 인터페이스에 객체 대입하는게...?
		
		// 리모콘을 통해서 TV의 전원을 켬
		rcTv.turnOn(); // tv의 객체를 인터페이스와 연결했으니 tv가 켜진다.
		// 인터페이스에 접근하여 켰지만 티비가 켜진다.
		
		rcAudio = new Audio();
		
		rcAudio.turnOn();
////////////////////////////////////////////////////////////////////
		
		use(new Television()); // 위에 객체랑 상관없이 밑에 메소드로 실행한거임
		use(new Audio()); // 이런 형식을 주로 사용하게 된다.
	}
	
	public static void use(RemoteControl rc) { 
		// 매개변수로 이 인터페이스가 구현 가능한 객체들이 들어갈 수 있음 -> Tv랑 Audio
		// 상속이랑 비슷하다는디...상속을 잘 몰라서 모르겠다...
		rc.turnOn();
	}

}
