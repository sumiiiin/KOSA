package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("삼성", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone); 
		// 객체를 출력하는데 왜 메소드가 호출되지?
		// 원래 객체의 문자정보(toString)가 자동적으로 나오는데 
		// 내가 오버라이딩(toString)해서 메소드 호출을 안했지만 정보가 나오는 것이다.
		
		String info = "나의 폰은: " + myPhone;
		System.out.println(info);
	}

}
