package ch13.sec02.exam01;

// Generic
public class Product <K, M>{
	
	//field
	private K kind; 
	private M model;
	
	//method
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
