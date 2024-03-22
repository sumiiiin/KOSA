package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		// 상수로 정하지 않는 이유 -> 나라가 망하거나 새로 생길 수 있어서
		// 사용 가능한 영역 ID 집합을 문자열 배열에 대입
		// getTimeZine메소드에 사용할 수 있는 나라(지역)들이 나옴
		for(String id : availableIDs) { // 하나씩 출력
			System.out.println(id);
		}
	}
}