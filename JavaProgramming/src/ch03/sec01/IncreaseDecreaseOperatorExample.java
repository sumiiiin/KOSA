package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x); //출력: 12
		System.out.println("---------------------------");
		
		y--;
		--y;
		System.out.println("y= " + y); // 출력: 8
		System.out.println("---------------------------");
		
		z = x++;
		System.out.println("z=" + z); // 출력: 12, 변수 뒤에 증감연산자가 있으니 마지막에 증감연산자 적용, x를 z에 값을 넣은 다음에
		System.out.println("x=" + x); // 출력: 13, x에 증감연산자 적용
		System.out.println("---------------------------");
		
		z = ++x;
		System.out.println("z=" + z);// 출력: 14
		System.out.println("x=" + x);// 출력: 14
		System.out.println("---------------------------");
		
		z = ++x + y++;
		System.out.println("z=" + z);// 출력: 23
		System.out.println("x=" + x);// 출력: 15
		System.out.println("y=" + y);// 출력: 9
		

	}

}
