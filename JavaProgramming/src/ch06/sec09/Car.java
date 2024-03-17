package ch06.sec09;
public class Car {	
	// 필드 선언
	static String company = "현대자동차"; // 값을 바꾸지 않을거면 static으로 하는게 좋다.
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model){
		this.model = model; 
		// 객체 자신을 가리키는 this연산자 사용(static이면 클래스로 접근해야 해서 사용할 수 없다.)
	}
	
	// 메소드 선언
	static void info() { // 객체 없이도 실행 될 수 있어, 지금 객체가 없는 상태거든
		System.out.println(company+"가 설계한 자동차");
//		this. model = "그랜저" 
//		// 객체가 있어야 실행됨 this가 객체 자신을 지칭하니까, info에 static을 지우면 오류 안 뜸
//		Car.model = "그랜저"; 
		// 해당 메소드 내에서는 어떤 Car 인스턴스의 model을 사용할지 알 수 없기 때문에 오류가 발생
		// 이건 정적이던 아니던 안된다. 
		company = "그랜저"; // 정적 필드라서 오류 안남
//		modle = "그랜저"; // 인스턴스 필드라서 오류 남
		
		// static으로 선언된 메소드 안에는 객체를 통해 호출할 수 있는 메소드를 넣을 수 없어		
	}
	
	void setSpeed(int speed) {
		this.speed = speed; 
		model = "그랜저";
		// this.speed는 객체가 가지고 있는 필드를 지칭하니까 필드에 speed가 있어야 함
		company = "그랜저"; 
		//info 메소드는 인스턴스 메소드로 선언되었지만, 정적 필드 model을 수정하고 있기 때문에 
		//해당 메소드가 인스턴스를 특정하지 않고 클래스 수준에서 호출되어야 합니다.  
		// 오류는 안남 근데 혼란스러워서 그런 짓은 하지 않는게 좋다.
	}
	static void run() {
//		setSpeed(100);
//		System.out.println(this.model+ "가 달립니다. (시속: "+this.speed+"km/h)");
		info();
	}
	void runrun() {
		setSpeed(100);
		System.out.println(this.model+ "가 달립니다. (시속: "+this.speed+"km/h)");
		// runrun에는 매개변수가 없어서 실행문에 this를 안 붙여도 상관 없지만 
		// 인스턴스 필드임을 명시하기 위해 사용했어	
	}

}
