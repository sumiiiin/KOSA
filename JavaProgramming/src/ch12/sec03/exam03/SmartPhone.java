package ch12.sec03.exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company,String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		
		return company + ", " + os;
	}
	
	// toString이 원래 객체의 문자 정보를 리턴하는데 문자정보에는 클래스이름@16진수의 해시코드가 들어가서 쓸모가 없다.
	// 재정의 해서 제조사와 운영체제가 결합된 문자열을 반환하겠다.

}
