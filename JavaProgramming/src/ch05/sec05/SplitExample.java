package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		
		String board = "1,자바 학습,참조타입 String을 학습합니다.,홍길동";
		
		// 문자열 분리
		String[] tokens = board.split(",");
		
		// 인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println("-------------------------");
		
		// for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		System.out.println("-------------------------");
		
		String board1 = "번호,제목,내용,성명,이메일,전화번호,주소"; 
		// 추가 하면 추가하는 만큼 배열의 크기가 늘어남
		String[] arr = board1.split(",");
		
		System.out.println(arr.length);
		
		// .length()는 배열에만 사용 가능한 필드(속성)이다.
		

		
	}

}
