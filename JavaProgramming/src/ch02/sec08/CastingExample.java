package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2); // var1 = 1000의 결과로 -24가 나옴 쓰레기 값
		// byte안에 들어가는 만큼만 가져와서 byte의 범위를 넘으면 값의 손실을 초래한다.
		
		long var3 = 300; 
		int var4 = (int) var3; // long을 int로 강제 변환 함
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); // 65번호에 해당되는 문자가 출력
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8); 
		// 정수는 실수를 온전히 표현할 수 없기 때문에 소수점자리는 버리고 출력된다.(반올림도 아님)

	}

}
