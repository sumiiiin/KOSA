package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 3
		// subject에서 "프로그래밍"이 인덱스3번째 부터 시작하기 때문에 3을 반환
		// 만약 값이 없으면 -1을 반환하게 된다.
		String substring = subject.substring(location); // 인덱스 3 이후부터 마지막까지
		System.out.println(substring); // 프로그래밍
		
		location = subject.indexOf("자바");
		
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바"); // 문자열이 포함되어있는지만 조사(인덱스 반환 x)
		
		if(result) {
		System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
	}

}
