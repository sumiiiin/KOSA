package ch08.sec04;

public interface RemoteControl {
	
	// 상수필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // 앞에 생략 가능
	
	// 추상 메소드
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
