package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20l; // 메모리를 많이 차지하긴 하지만 틀린건 아님
//		long var3 = 10000000000000; // 컴파일러는 정수는 일단 int(4바이트)로 받기 때문에 숫자 뒤에 L(소문자도 가능)을 붙여줘야 한다.
		long var4 = 10000000000000l;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
