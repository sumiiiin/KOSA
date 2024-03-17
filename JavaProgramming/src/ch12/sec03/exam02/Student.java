package ch12.sec03.exam02;

public class Student {
	
	//field
	private int no;
	private String name;
	
	//Constructor
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	//method
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode(); // 이건 super의 메소드
		return hashCode;
		// 이 메소드를 사용하면 int hashCode라는 변수에 해시코드 값이 생긴다는 건가?
	}
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
	
	// 해시코드가 원래 객체의 메모리번지를 이용해서 해시코드를 생성하고 정수값을 리턴하는 놈
	// 재정의에서 
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		
		
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
//	
//
}
