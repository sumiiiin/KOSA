package test.pb03;

import java.util.Scanner;

public class mh {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // 세 정수 A, B, C를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // A * B * C의 결과값을 계산
        int result = A * B * C;

        // 0부터 9까지의 숫자 개수를 저장할 배열
        int[] counts = new int[10];
        //counts = [0, 1, 1, 1, 1, 0, 0, 0, 0, 0]
        //          0  1  2  3  4  5  6  7  8  9
        // 결과값에서 각 숫자별 개수를 세기
        while (result > 0) {
            int digit = result % 10;   // 현재 자리의 숫자
            counts[digit]++;           // 해당 숫자의 개수 증가
            result /= 10;              // 다음 자리로 이동
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
    }
}
