package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		// 같은 생성자 이름이지만 도트 연산자 활용해서 
		// 자동완성으로 매개변수 두개 받는 버전 선택하고 하나만 썼더니 오류났다. 
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaReatangle(10,20);
		
		System.out.println("정사각형의 넓이 " + result1);
		System.out.println("직사각형의 넓이 " + result2);
	}

}
