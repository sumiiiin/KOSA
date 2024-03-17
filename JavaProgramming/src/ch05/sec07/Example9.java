package ch05.sec07;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = null; // 사용하려면 초기화 해줘야 함
		int student = 0; // 전역으로 쓰기 위해 while문 밖에 선언 및 초기화
		int max = 0;
		double sum = 0;
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			
			System.out.print("선택 > ");
			String num = scanner.nextLine(); // 메뉴 고르기
			
			
			if(num.equals("1")) { // 번호가 1이면
				System.out.print("학생 수 > ");
				String one = scanner.nextLine(); // 학생수를 받을 스캐너로
				student = Integer.parseInt(one); // 학생 수를 student변수에 담을 거야
				
				arr = new int[student]; // 전역에서 선언하고 null로 초기화 한 배열 변수는 student 값 만한 크기이다. 
				
			} else if(num.equals("2")) { // 번호가 2이면
				
				for (int i=0; i<student; i++) { // i는 0으로 초기화, student미만까지 반복, i는 1씩 증가
					System.out.print("scores["+i+"]>"); 
					String two = scanner.nextLine(); // 점수를 받을 스캐너 값은
					arr[i] = Integer.parseInt(two);	 // int형으로 바꾸고 arr에 인덱스 순서로 대입
						
				}
				
			} else if (num.equals("3")) { // 번호가 3이면
				for(int i=0; i<arr.length; i++) { // arr.length = student
					System.out.println("score["+i+"]: "+ arr[i]); // score에 담긴 배열의 값 순차적으로 출력
				}
			} else if (num.equals("4")) { // 번호가 4이면
				for(int i=0; i<arr.length; i++) { // // arr.length = student
					sum += arr[i]; // sum에 학생들의 점수 순차적으로 더하기
					if(max<arr[i]) { // 0으로 초기화 된 max에 배열의 값을 순차적으로 비교 했을 때 max가 arr[i]보다 작으면 
						max = arr[i]; // max값에 대입해라
					}
					double avg = sum / arr.length; // 합계 / 학생수 = 평균
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + avg);
				}
				
			} else if (num.equals("5")){ // 번호가 5이면
				System.out.println("종료");
				break; // while문을 종료 해라
			} 
			  else { // 다른 값 입력을 하면 어차피 break; 문이 나올 때 까지 계속 입력하게 됨 
				System.out.println("올바른 숫자를 입력하세요"); // 올바르게 입력하라고 출력하기
			}
			
			
		}
		
	}

}
