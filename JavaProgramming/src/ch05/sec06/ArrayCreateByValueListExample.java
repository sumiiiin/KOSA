package ch05.sec06;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		
		String[] season = {"Spring","Summer","Fall","Winter"};
		System.out.println(season[0]); // Spring
		System.out.println(season[1]); // Spring
		System.out.println(season[2]); // Spring
		System.out.println(season[3]); // Spring
		
		System.out.println("--------------------------------");
		// 인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println("--------------------------------");
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {83,90,87};
		
		// 총합과 평균 구하기
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3; // 정수와 정수의 연산 값은 정수가 나와서 실수 표현까지 하려면 강제 타입변환을 해야한다.(실수와 정수의 연산은 실수가 반환된다.) 
		System.out.println("평균 : " + avg);
		
	}

}
