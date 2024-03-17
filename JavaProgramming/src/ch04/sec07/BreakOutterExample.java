package ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) {
		
		Outter: for(char upper ='A'; upper<='Z'; upper++) { 
			// 'A'는 정수로 65이기 때문에 1씩 증가하면 알파벳 순서대로 나오게 된다. Z까지만 참으로 조건식을 정한다.
					for(char lower = 'a'; lower<='z';upper++) {
						// lower는 a이고 실행문이 실행 될 때마다 알파벳이 올라가고(abcde...) z가 넘어가면 false가 된다. 그럼 반복문이 멈춘다.
						System.out.println(upper + "-" + lower++);
						if(lower == 'g') { // 실행문을 멈출 장치
							break Outter; // 밖에 Outter라벨을 단 for문을 닫는다.
//							break; // 그냥 break를 하면 밖의 for문은 끝까지 반복된다.
						}
					}
				}
		
		System.out.println("프로그램 실행 종료");
	}

}
