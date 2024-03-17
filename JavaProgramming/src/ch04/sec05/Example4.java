package ch04.sec05;

public class Example4 {
	public static void main(String[] args) {
		
		int sum = 0;
		
//		boolean run = true;
				
		while(true) {
			int dice1 = (int) (Math.random()*6) +1;
			int dice2 = (int) (Math.random()*6) +1;
			
			sum = dice1 + dice2;
			System.out.println(dice1+"|"+dice2);
			
			if (sum == 5) {
//				run = false;
				break;
			}
		}
		
	}

}// 두번의 주사위를 돌려서 합이 5가 나오면 멈추는 코드
