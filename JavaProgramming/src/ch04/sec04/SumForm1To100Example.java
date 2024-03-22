package ch04.sec04;

public class SumForm1To100Example {
	public static void main(String[] args) {
		int sum = 0; // 초기화 변수
		int i; // 카운터 변수, 변수만 선언해도 됨(초기화를 해도 오류가 나진 않음), for문 안에 초기화식이 있기 때문
		
		for(i = 1; i <= 100; i++) { //i는 1이고 실행문이 실행 될 때마다 1씩 늘어나며, i가 100이 넘어가면 멈춘다
			sum += i; // for문이 1번 실행 될 때 마다 sum에 i의 값을 더하라, 즉 1부터 100까지의 수를 더하라
		} 
		
		System.out.println("1~" + (i-1) + "합: " + sum);
		
		// for문 조건문(괄호)에는 3가지의 식이 있는데 한가지 식에 한 개 이상의 식을 넣을 수 있다.
		// ex. for(int i = 0, j = 100; i <= 50 && j >=50; i++, j--) {...} 
	}

}
   