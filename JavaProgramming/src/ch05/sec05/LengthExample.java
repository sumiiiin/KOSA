package ch05.sec05;

public class LengthExample {
	public static void main(String[] args) {
		
		String ssn = "9506241230123";
		int length = ssn.length(); // 문자열의 길이를 구하는 String 메서드 호출
		
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}

}
