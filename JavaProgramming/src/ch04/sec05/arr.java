package ch04.sec05;

public class arr {

	public static void main(String[] args) {
		int[][] arr = new int[2][7];
		
		int i = 1;
		
		for (int row = 0; row < arr.length; row++) {
			for (int colume = 0; colume < arr[row].length; colume++) {
				arr[row][colume] = i++;
				System.out.print(arr[row][colume] + " ");
			}
		}
		
	}

}

// [[I@372f7a8d 주소값 -> 주소를 찾아가서 값을 꺼내? 어떻게?
// 값을 호출하는 무언가가 있을까 -> 배열 변수를 사용하려면 인덱스를 써야한다.

