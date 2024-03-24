package test.pb03;

import java.util.Scanner;

public class pb03 {
	public static void main(String[] args) {
		
//		세 정수 A, B, C를 사용자로부터 입력받아 곱한 값에 0~9의 숫자가 각각 몇개 들어있는지 센다. 
//		첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
//		마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 
//		1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		
		Scanner scanner = new Scanner(System.in); 
		int[] inNum = new int[3]; // 세 정수를 받을 배열
		int mul = 1; // 곱하기 용 초기화 변수
		
		// 사용자로부터 정수 3개 배열에 입력받고 곱한 값 추출
		for(int i = 0; i<3; i++) {
			System.out.print("정수"+i+": ");
			int n = scanner.nextInt();
			inNum[i] = n; // 정수 3개 배열에 저장
			mul *= n; // 정수 3개 받을 때 마다 곱하기
		}
		// 변수 3개에 
		
		// 정수를 분해하기 위해 문자열로 바꾸기
		String strMul = String.valueOf(mul);
		
		// 자릿수마다 분해해서 배열에 넣기
		String[] arrMul = strMul.split("");
		
		// 자릿수만큼의 길이로 정수 배열 생성 
		int[] intArrMul = new int[arrMul.length];
		
		// 다시 정수로 변환하고 정수배열에 넣기
		for(int i = 0; i<arrMul.length; i++) {
			int n = Integer.parseInt(arrMul[i]);
			intArrMul[i] = n;	
		}
		
		// 각 자릿수 마다 변수 선언
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		
		// 배열을 돌며 해당하는 숫자에 1씩 더하기
		for(int i = 0; i<intArrMul.length; i++) {
			switch (intArrMul[i]) { // for문 하나로
			case 0: {
				zero++;
				break;
			}
			case 1: {
				one++;
				break;
			}
			case 2: {
				two++;
				break;
			}
			case 3: {
				three++;
				break;
			}
			case 4: {
				four++;
				break;
			}
			case 5: {
				five++;
				break;
			}
			case 6: {
				six++;
				break;
			}
			case 7: {
				seven++;
				break;
			}
			case 8: {
				eight++;
				break;
			}
			case 9: {
				nine++;
				break;
			}
			
			}
		}
		
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		
		
		
		
		
		
	}

}
