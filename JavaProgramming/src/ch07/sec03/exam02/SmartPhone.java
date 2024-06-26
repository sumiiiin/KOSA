package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	
	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		super("그랜저", color); 
//		super(); // 부모 생성자에 매개변수가 있어서 안된다.
		// 안 써도 컴파일 과정에서 자동 실행, super는 부모라는 뜻, 
		// 근데 부모 생성자에 매개변수가 있으면 반드시 호출해야 함
		// 지금 매개 변수 있어서 넣어줘야 함, 근데 그 값을 여기서도 넣네
		// 명시적으로 넣어야해가 뭔 말이여 this.model 이런거 사용 안된다는 말인가.
		// 그리고 super() 메소드 호출은 자식 생성자 첫 줄에 작성해야 함
		System.out.println("자식 SmartPhone 생성자 호출");
		this.model = model;
		this.color = color;
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
