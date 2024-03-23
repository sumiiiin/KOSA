package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
//		MobilePhone mp = new MobilePhone("홍길동") { // 추상클래스이기 때문에 new로 객체 생성을 못함
//		};
		
//		AndroidPhone ap = new AndroidPhone("홍길동");
		MobilePhone mp;
		mp = new AndroidPhone("홍길동"); // 자동타입변환
		mp.turnOn(); 
		// 이 메소드는 오버라이딩 어노테이션만 안 붙였지 같은 메소드 이름을 썼기 때문에 재정의가 맞다
		
		mp.internetSeach();
		// 이건 추상메소드라 강제 오버라이딩 함
		
		mp.turnOff();
		// 이 메소드는 자식클래스에 없지만 상속 받은 부모 메소드 나온다.
		System.out.println();
		
		mp = new IPhone("홍수민");
//		mp.turnOnn(); 
		// 부모클래스에 대입한 자식객체는 자식 고유의 메소드를 사용할 수 없다.
		mp.internetSeach(); 
		// 이건 추상메소드로 강제 오버라이딩 한거라 사용 가능
//		mp.turnOffn();
		
		IPhone ip = new IPhone("홍수민");
		// 자식 객체 생성해서
		ip.turnOnn(); // 자식 고유의 메소드 사용 가능
		ip.internetSeach();
		ip.turnOffn();

	}

}
