package ch06.sec10.exam02;

public class Television {
	
	// Field 선언
	static String company = "MyCompany"; // 객체마다 가질 필요가 없는 공통 데이터는 static으로 선언
	static String model = "LCD";
	static String info; 
	// static 필드는 리터럴로 초기화 하는게 대부분이지만, 만약 하지 않았다면 정적필드를 통해 할 수 있다.
	
	static { // 정적필드, 메소드 영역으로 로딩 될 때 올라가서 필드 초기화 함
			// 인스턴스 필드의 초기화는 정적 블록에서 할 수 없음
			// 정적 메소드를 호출 할 수고 있다.
		info = company+"-"+model;
	}
	
	// Constructor 선언
	
	
	//Method 선언

}
