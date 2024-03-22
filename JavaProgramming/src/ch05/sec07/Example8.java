package ch05.sec07;

public class Example8 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		int sum = 0; // 초기화
		int count = 0; // 초기화 
		
		for(int i=0; i<array.length; i++) { // array.length = 2차원 배열의 1차원 길이
			count += array[i].length; // 배열안에 있는 배열의 길이를 count 변수에 더하기
			for(int k=0; k<array[i].length; k++) { // 배열 안에 있는 배열의 길이 만큼 반복
				sum += array[i][k]; // 2차원 배열에 있는 모든 값이 순차적으로 sum에 더하기
			}
		}
		double avg = (double) sum / count; // 평균 값을 실수로 받기 위해 sum을 실수형으로 강제변환
		System.out.println("전체합: "+sum);  
		System.out.println("전체 평균: "+avg);
		
		}
	}// 배열의 전체합과 평균을 구하는 코드

