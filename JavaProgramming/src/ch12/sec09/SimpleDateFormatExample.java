package ch12.sec09;

import java.text.SimpleDateFormat;

import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 문자열 형식이라 결합연산자 필요 없다. 짱!
		// 생성자의 매개변수에 어떤 문자열이 들어가도 해당하는 규격만 바꿔주는건가 그럼 매개타입이 뭐지?
		// 도큐먼트 가보니 SimpleDateFormat(String pattern)이라고 한다.
		// String pattern은 받은 문자열 값을 pattern이라는 문자열 변수에 담는단 소리인가 아님 문자열 패턴이라는 타입이 자바에 따로 있는 건가? 
		
		
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println( sdf.format(now) );
	}
}