package ch06.sec13.exam03.package1;

public class B {
	
	// 필드 선언
	A a = new A();
	
	// 생성자 선언
	public B() {
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // 안됨
		
		a.method1();
		a.method2();
//		a.method3(); // 안됨
		
	}
}
