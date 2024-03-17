package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
//		byte x = 200; // -128 ~ 127 범위를 넘었기 때문에 type mismatch 에러남
		byte x = 30;
		byte y = 50;
		
//		byte result = x + y; // 변수의 연산은 cpu에서 계산할 때 1바이트 용량이어도 4바이트로 변환하여 하기 때문에 int형이다.  
		int result = x + y;
		
		byte z = 30 + 50; 
		// 리터럴 연산은 컴파일러가 컴파일 할 때 알아서 먼저 계산하고 80을 만들어놓고 본다.(바이트코드 보면 확인 됨) 결론적으로 그냥 80이랑 똑같다는 말
		
		System.out.println(result);
		
		int xx = 2100000000;
		int yy = 2100000000;
		
		int resultt = xx + yy; // 결과값이 int범위를 넘으면 결과값이 어떻게 나올까? -> 에러 안나고 이상한 결과값이 나옴(-94967296)
		System.out.println(resultt);
		
		/*		4,200,000,000은 int 데이터 타입의 최대값을 초과하므로, 이 값에서 최대값을 반복 제외한 나머지가 결과값으로 나오게 됩니다. 
				이것이 -94967296인 것입니다. Overflow를 방지하려면 더 큰 데이터 타입인 long을 사용해야 합니다.*/

	}

}
