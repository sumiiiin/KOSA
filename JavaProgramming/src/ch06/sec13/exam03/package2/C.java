package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	
	// 필드 선언
	A a = new A();
	
	// 생성자 선언
	public C() {
		a.field1 = 1;
//		a.field2 = 1; // 다른 패키지라 안됨
//		a.field3 = 1; // 프라이빗은 그냥 안됨
		
		a.method1();
//		a.method2(); // 다른 패키지라 안됨
//		a.method3(); // 프라이빗은 그냥 안됨
		
	}
	
	// 메소드 선언
}
