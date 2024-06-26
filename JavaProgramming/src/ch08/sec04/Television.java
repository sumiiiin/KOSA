package ch08.sec04;

public class Television implements RemoteControl{
	
	// field
	public int volume;
	
	
	// Constructor
	
	
	// method
	@Override // 가급적 붙이기
	public void turnOn() {
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		} else { 
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨: " + this.volume);
	}
	

}
