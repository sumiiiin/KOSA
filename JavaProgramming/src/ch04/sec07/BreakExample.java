package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) {
		
		while(true) {
			int num = (int) (Math.random()*6) + 1; // int형의 0~1미만 까지의 난수에 6을 곱하고 1을 더해라 
			System.out.println(num); // num값을 출력하라
			if(num == 6) { // num값이 6과 같으면 멈춰라
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
