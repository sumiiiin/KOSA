package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분"); // 문자열과 숫자가 더하기로 만나면 문자열 결합이 된다.
		System.out.println(hour + minute + "분"); // 숫자 + 숫자 + 문자는 앞에서 부터 더해지기 때문에 숫자끼리 먼저 더하고 그다음에 문자열 결합이 된다.

	}

}
