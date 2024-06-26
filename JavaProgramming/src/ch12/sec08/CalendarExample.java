package ch12.sec08;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// 캘린더는 추상 클래스로 생성자를 생성 할 수 없는 대신
		// 시스템의 기본 달력 시스템을 기반으로 한 새로운 캘린더 인스턴스를 얻을 수 있다.
		// 객체도 생길 뿐만 아니라 현지의 달력 정보까지 담긴 객체가 생성
		
		System.out.println(now); 
		// 캘린더 타입은 자바가 이미 toString을 오버라이딩 함
		// 그래서 읽을 수 있는 값이 나온다.
		
		int year    = now.get(Calendar.YEAR); 
		// calendar의 메소드, 매개 값으로는 int field값이 들어가는데
		// 어떤식으로 들어갈까?
		int month  = now.get(Calendar.MONTH) + 1;          
		int day    = now.get(Calendar.DAY_OF_MONTH);     
		
		int week    = now.get(Calendar.DAY_OF_WEEK);        
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY: 		strWeek = "월"; 	break;
			case Calendar.TUESDAY: 		strWeek = "화"; break;
			case Calendar.WEDNESDAY: 	strWeek = "수"; break;
			case Calendar.THURSDAY: 	strWeek = "목"; break;
			case Calendar.FRIDAY: 		strWeek = "금"; break;
			case Calendar.SATURDAY: 	strWeek = "토"; break;
			default: 							strWeek = "일";
		}
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}