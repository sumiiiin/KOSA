package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		} 	// switch문은 조건식이 아닌 변수를 조건으로 case의 순서대로 실행하게 된다. 
			// 알맞은 변수의 값을 찾아 값이 일치하면 해당하는 실행문을 실행하는데 
			//break를 걸어놓지 않으면 해당하는 실행문 이후의 다른 모든 실행문들도 실행하게 된다. 
			// 맨 마지막의 default는 아무것도 해당하지 않으면 나오는 값으로 break는 필요 없다.
	}

}
