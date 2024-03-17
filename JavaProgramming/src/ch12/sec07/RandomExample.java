package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample extends Random{
	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		// 길이가 6인 selectNumber 배열 초기화 
		Random random = new Random(3);
		// seed값을 3으로 준 random 객체를 Random 타입에 대입
		System.out.print("선택번호: ");
	
		for(int i=0; i<6; i++) { // 6번 반복하는 반복문 
			selectNumber[i] = random.nextInt(45) + 1;
			// 반복 할 때마다 0~44개의 난수 발생하는데 0은 로또에 없는번호라서 1을 더함
			// 반복 할 때 마다 selectNumber배열에 추가한다.
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		//당첨여부
		Arrays.sort(selectNumber);
		// int 배열에 있는 값 정렬, 메소드 실행하면 따로 저장안해도 저장되나보군 
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		// 배열의 값이 같은지 확인  
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
			
			
			System.out.println(Arrays.toString(selectNumber)); 
			// 이거 배열의 값 나오게 어떻게 하지?
			// 지금 사용하는 toString은 object의 메소드?
			// 랜덤 클래스 만들고 @Data 롬복 했는데 안되네...
			// 뭘 더 해야하나? 오버라이딩 해야 하나? 그거 안하려고 롬복 쓰는거 아닌가?
		}
	}
}

