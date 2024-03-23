package ch13.sec05;

public class Applicant <T>{
	
	public T kind; // 어떤 신청자가 올 지 모르니 타입 파라미터
	
	public Applicant(T kind) { 
		this.kind = kind;
	}

}
