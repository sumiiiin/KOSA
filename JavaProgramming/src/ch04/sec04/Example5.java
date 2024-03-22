package ch04.sec04;

public class Example5 {
	public static void main(String[] args) {
		
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((4*x)+(5*y) == 60) {
					System.out.println("(" + x+","+y+")");
				}
				
			}
		}
		
	}
	// 중첩 for문을 이용해서 4x + 5y = 60의 모든 해를 구하는 코드, x와 y는 10 이하의 자연수
		

}
