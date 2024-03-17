package check08.p06;

public class SoundableExample {
	
	// 메소드 선언
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}
//	Soundable soundable;
	
	Soundable soundable = new Cat();
	
	// 실행 메소드
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
