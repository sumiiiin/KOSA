package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		
		// 오버라이딩 사용
		Calculator cal =  new Computer(); // 자식
		double result = cal.areaCircle(10);
		System.out.println(result);
		System.out.println();
		
		// 부모꺼 끌고 옴
		Calculator calc = new Calculator(); // 부모꺼 호출하면 부모껄로 나옴
		double re = calc.areaCircle(11);
		System.out.println(re);
	}

}
