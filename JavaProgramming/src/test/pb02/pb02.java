package test.pb02;

import java.util.Scanner;

public class pb02 {

	public static void main(String[] args) {
//		7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 출력하고, 
//		고른 홀수들 중 최솟값을 출력하는 프로그램을 작성하시오.
//		예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 
//		이들 중 홀수는 77, 41, 53, 85이므로 그 합은 77 + 41 + 53 + 85 = 256 이 되고, 
//		41 < 53 < 77 < 85 이므로 홀수들 중 최솟값은 41이 된다. 
//		만약 홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력한다.
//
//		입력방법
//		12,77,38,41,53,92,85
//		출력내용
//		256
//		41

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int[] intArr = new int[7];
		

		for (int i = 0; i < 7; i++) {
			System.out.print("7개의 자연수 입력: ");
			String str = sc.nextLine();
			a = Integer.parseInt(str);
			intArr[i] = a;
		}
		
		int sum = 0;
		
		int max = 0;
		
		int min = max;
		
		int[] arr = new int[7];
		
//		int count = 0;
		
		// 홀수의 합과 홀수의 갯수 알아내는 for문
		for (int i = 0; i<intArr.length; i++) {
			if (intArr[i] % 2 == 1) {
				sum += intArr[i];
				
				arr[i] += intArr[i]; 

				}
			}
		
		
		for(int i = 0; i<intArr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		} // min 초기화 할 최대 값 구하기
		
		System.out.println("최대"+max);
		
		min = max;
		
		for (int i = 0; i<intArr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = max;
			}
		} // 0값 최대 값으로 바꾸기
		
		for(int i = 0; i<intArr.length; i++) {
			if(min<arr[i]) {
				
			} else {
				min = arr[i];
			}
		}
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println("for문"+arr[i]);
		}
		
		System.out.println(sum); // 합계
		System.out.println(min);
		
		
		
		
		
		
		

	}

}
