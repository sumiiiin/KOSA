package ch05.sec07;

public class Example7 {
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = 0; // 초기화
		
		for (int i=0; i<array.length; i++) { // 배열의 길이 미만 만큼 반복
			if (max < array[i]) { // array배열의 값을 순차적으로 도는데 max값보다 크다면
				max = array[i]; // max값을 array[i]로 대입해라
			}
		} System.out.println(max);
	}

}// 배열의 항목에서 최대값을 출력하는 코드
