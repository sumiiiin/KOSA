package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		//0~1사이의 실수를 반환하는 Math.random함수에 6을 곱하면 0 이상 6 미만까지 나오게 된다. 
		//그리고 모든 값에 1을 더해 1이상부터 7미만 값을 받아 정수로 강제 변환을 하면 
		// 정수 값만 반환되어 1~6까지의 난수값이 나오게 된다.    
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		System.out.println(Math.random());
	}

}
