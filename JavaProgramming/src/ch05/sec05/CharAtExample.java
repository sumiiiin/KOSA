package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		
		String ssn = "9506241230123"; // 주민번호
		
		char sex = ssn.charAt(6); 
		// 주민번호가 담긴 변수에서 6번째 자리의 값을 반환하여 성별변수에 담아라
		switch (sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	} 	// 코드가 실행되고 난 후 메모리엔 String객체만 남는다, String객체는 heap영역에 저장된다. 
		// char는 기본 변수라서 객체 생성을 하지 않으니까 코드 실행 후엔 메모리에서 사라진다.
		// stack영역의 메모리는 코드 실행 후에 사라진다.
		// 그럼 쓰레기객체는 실행되고 난 후 사라지는건가-> ㄴㄴ 코드의 실행과 상관없이 가비지 컬렉터가 수거할 때 사라짐
		// 
	

}
