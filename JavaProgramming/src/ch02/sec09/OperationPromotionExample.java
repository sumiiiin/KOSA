package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte result1 = 10 + 20; //컴파일 단계에서 연산
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //컴파일 이후 JVM에서 연산, 연산에선 int로 변환되기 때문에 연산값을 받으려면 int로 받아야 함
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 10000000; //L을 붙여도 되고 안 붙여도 됨
		
		long result3 = v3 + v4 + v5; //long이 제일 크니가 long에 담아
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; // 얘도 연산이니까 int로 받자
		System.out.println((char) result4); // 변수에 안넣고도 출력단에서도 타입변환 가능, 출력: B
		
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println(result5); // 출력: 2
		
		int v88 = 10;
		double result55 = (double) v88 / 4;
		System.out.println(result55); //출력: 2.5
		
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		

	}

}
