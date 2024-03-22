package ch08.sec05;

public class Audio implements RemoteControl{
	
	// field
	public int volume;
	public int memoryVolume; 
	
	
	// Constructor
	
	
	// method
	@Override // 가급적 붙이기
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 켭니다.");
		
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
		System.out.println("현재 오디오 볼륨: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			memoryVolume = volume;
			setVolume(MIN_VOLUME);
		} else {
			setVolume(memoryVolume);
			System.out.println("무음 해제합니다. 현재 볼륩: " + volume);
			
		}
	}
	

}
