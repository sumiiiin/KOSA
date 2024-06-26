package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null; //Week는 참조 타입이니까 null을 대입할 수 있다.
		
		Calendar now = Calendar.getInstance(); // import 해야함 now가 calendar객체를 참조
//		int year = now.get(Calendar.MONTH)+1; // 0~11까지 12달이라 1 더해야 함
//		int month = now.get(Calendar.DAY_OF_MONTH); // 일
//		int hour = now.get(Calendar.HOUR);
		int week = now.get(Calendar.DAY_OF_WEEK); // 일요일은 1, 월요일은 2 ...
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(hour);
		
		switch(week) { // 캘린더 메소드를 통해 요일에 대한 정수 상수를 받았음
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		// 케이스 별로 설정함
		}
		
		if (today == Week.SUNDAY) { // 열거타입을 쓰면 가독성이 좋다.
			System.out.println("일요일에는 자바 공부를 합니다.");
		} else {
			System.out.println("일요일은 아니지만 자바 공부를 합니다.");
		}
		
		System.out.println(args.length);
		
	}
}
