package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc =  new Calculator(); // 객체 생성자 호출
		
		myCalc.powerOn(); // 메소드 호출, 객체에서 만든 실행문이 실행된다.
		System.out.println();
		
		myCalc.plus(3, 5); // 리턴값이 있는 메소드라서 값을 받을 변수가 필요하다. 없어도 오류가 나는건 아님
		
		int result1 = myCalc.plus(3, 5); // 리턴 값을 알맞은 타입의 변수로 넣는다.
		System.out.println(result1);
		System.out.println();
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		System.out.println();
		
		myCalc.powerOff(); // 리턴값이 없는 메소드라서 변수를 받으려고 하면 오류난다.
		
		

	}

}
