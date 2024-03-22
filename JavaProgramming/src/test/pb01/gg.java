package test.pb01;

import java.util.Scanner;

public class gg {

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
		
		int[] arr = new int[7];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<7; i++) {
			System.out.print("자연수" + i + ":");
			int a = sc.nextInt();
			arr[i] = a; // 자연수 7개가 담긴 배열
			
			if(arr[i] % 2 == 1) {
				sum += arr[i];
				if(min > arr[i]) {
					min = arr[i];
				} 
			}
			
			
		}
		
		System.out.println("홀수의 합: " + sum);
		System.out.println("홀수 중 최소 값" + min);

	}

}
