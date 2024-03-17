package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6); // 인덱스 0 부터 6 전까지(0<6)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 인덱스 7부터
		System.out.println(secondNum);
	}

}
