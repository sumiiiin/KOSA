package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int i=2; i<=9; i++) {
			System.out.println(i + "단");
			for (int j=1; j<=9; j++) {
				int k = i*j;
				System.out.println(i +"*"+ j+ "=" +k); // 책 코드랑 비교해보자
			}
		}
	}

}
