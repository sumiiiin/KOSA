package ch04.sec04;

public class Example3 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=100; i+=3) {
			sum += i;
		} System.out.println(sum);
	}
}
// for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성