package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 12345678.89;

		DecimalFormat df; // 형식화 된 문자열 만들어 주는 킅래스 타입
		// 모든 기능은 다 클래스에 속해 있나?
		
		//정수 자리까지 표기
		df = new DecimalFormat("#,###"); // 형식을 매개 값으로 넣고 객체 생성 -> 정수 뒤에서 3자리마다 콤마 생성
		System.out.println( df.format(num) );// 객체의 메소드 호출하여 실수를 매개 변수로 넣기
		
		//무조건 소수 첫째 자리까지 표기
		df = new DecimalFormat("#,###.0"); // 위와 같은 형식인데 소수점 첫째자리는 표기
		System.out.println( df.format(num) );
	}
}