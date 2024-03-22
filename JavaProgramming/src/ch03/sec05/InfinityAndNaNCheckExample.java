package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0; //int y = 0; 일 때는 아예 오류가 남
		
		double z = x / y;
		
		System.out.println(z + 2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) { // 유효성 검사
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
	
	}
}
