package ch08.sec06;

public interface RemoteControl {
	
		// 상수필드
		public static final int MAX_VOLUME = 10;
		int MIN_VOLUME = 0; // 앞에 생략 가능
		
		// 추상 메소드
		abstract void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		////// 디폴트 메소드 선언
		// 메소드의 소속은 구현객체
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리 합니다.");
				setVolume(MIN_VOLUME);
			} else {
				System.out.println("무음 해제합니다.");
			}
		}
		
		// 정적 메소드 선언
		static void changeBattery() {
			System.out.println("리모콘 건전지를 교환하세요");
		}


}
