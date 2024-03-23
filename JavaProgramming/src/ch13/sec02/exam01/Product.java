package ch13.sec02.exam01;

// Generic
public class Product <K, M>{ // 타입을 모르는 제네릭 타입 두개 선언
	
	//field
	private K kind;
	private M model;
	
	//method
	// getter setter에도 제네릭 타입을 사용한다.
	public K getKind() {
		
		return this.kind; 
	}
	
	public M getModel() {
		
		return this.model;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

}
