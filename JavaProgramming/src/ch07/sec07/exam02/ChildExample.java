package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		
		// 자식 객체 생성
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		// 자식 객체 부모 클래스에 대입
		Parent parent = child; // 자식을 부모한테 자동 타입변환 가능
		
		parent.method1();
		parent.method2(); // 자식이 오버라이딩 한 메소드가 호출 된다.
//		parent.method3(); // 자식 객체를 부모한테 대입해서 부모한테만 있는건 안 됨
		// 그치만 자식 객체에 method3가 없는건 아냐  
		
		if(child == parent) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}

}
