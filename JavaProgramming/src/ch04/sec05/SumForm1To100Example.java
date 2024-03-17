package ch04.sec05;

public class SumForm1To100Example {
	// 예제 칠 때는 해석부터 하고 쳐라
	public static void main(String[] args) {
	
		int sum = 0;
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
		}System.out.println("1부터 100까지의 합: " + sum);
	
	}
}

