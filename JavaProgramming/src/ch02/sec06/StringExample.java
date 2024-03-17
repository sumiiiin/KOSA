package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
//		String str = "나는 "자바"를 배웁니다."; // 큰 따옴표 중간에 넣으면 안 됨
		String str = "나는 자바를 배웁니다.";
		String strr = "나는 \"자바\"를 배웁니다.";// 큰 따옴표 앞에 역슬래시 넣으면 큰따옴표 됨 (역슬래시가 이스케이프문자)
		String strrr = "나는 '자바'를 배웁니다.";
//		String strrrr = "나는 \자바\를 배웁니다.";// escape문자인 역슬래시를 넣으면 오류남
		String strrrr = "나는 \\자바\\를 배웁니다.";// 하나씩 더 넣으면 됨
		String strrrrr = "나는 \t자바를 배웁니다.";// tab만큼 띄어쓰기
		String strrrrrr = "나는 \n자바\r를 배웁니다.";// 줄바꿈, /r은 윈도우만 됨
		
		System.out.println(str);
		System.out.println(strr);
		System.out.println(strrr);
		System.out.println(strrrr);
		System.out.println(strrrrr);
		System.out.println(strrrrrr);
	}

}
