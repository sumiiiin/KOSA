package ch07.sec10.exam01;

public class AndroidPhone  extends MobilePhone{
//	public String owner;
	
	public AndroidPhone(String owner) {
		super(owner);
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("안드로이드폰 전원을 켭니다.");
	}
	
//	public void turnOff() {
//		System.out.println("안드로이드폰 전원을 끕니다.");
//	}
	
//	public void internetSeach() { // 이것도 아이폰과 공통된 메소드 -> 추상클래스에서 추상메소드로 선언
//		System.out.println("크롬 브라우저로 인터넷을 검색합니다.");
//	}
	@Override // 추상메소드를 오버라이딩함 -> 즉, 재정의 함
		public void internetSeach() {
		System.out.println("크롬 브라우저로 인터넷을 검색합니다.");
			
		} // 추상 메소드가 있는데 재정의해서 사용하지 않으면 오류 남 
		  // 추상 클래스를 상속 받고 그 추상클래스 안에 추상메소드가 있으면 무조건 오버라이딩 해야 함

}
