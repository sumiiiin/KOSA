package ch05.sec05;

public class EmptyStringExample {
	public static void main(String[] args) {
		
		String hobby = ""; // char 타입은 빈문자열 대입이 안됐지만 문자열 타입은 된다.
		//char타입은 정수형이기 때문일까? 
		
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열이다.");
		}
	}

}
