package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) { // i는 1이고 i는 1씩 올라간다.
			if(i%2 !=0) {
				continue; // if문이 거짓이더라도 for문이 끝날 때 까지 실행한다.
//				System.out.println(i + " "); // 이건 홀수만 나오네?
			} 		
			System.out.println(i + " ");
			
		}
	
	}

}
