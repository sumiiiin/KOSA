package test.pb04;

import java.util.ArrayList;
import java.util.Scanner;

public class pb04 {

	public static void main(String[] args) {
//		허술한 조이는 영어 소문자로 만든 허술한 비밀번호를 사용한다. 
//		그리고 실제 비밀번호를 다른 알파벳으로 변환한 암호를 포스트잇에 적어놓는다. 
//		실제 비밀번호를 찾는 프로그램을 만들어, 
//		이렇게 간단한 변환으로 암호를 만드는 허술한 조이에게 경각심을 심어주자. 
//		암호를 실제 비밀번호를 다시 바꾸는 방법은 다음과 같다. 
//		예를 들어 소문자 ‘h’는 4번째 뒤 문자인 ‘l’로 변환한다. 
//		소문자 ‘y’는 4번째 뒤 문자인 ‘c’로 변환한다. 알파벳의 순서를 따질 때, 
//		마지막 알파벳인 z 다음에는 a가 오는 것으로 계산한다. 
		
		// 계획
		// 알파벳 배열을 하나 만든다.
		// 입력받은 문자로 해당 인덱스를 찾고 인덱스에 +4를 해서 암호알파벳을 찾는다.
		// 맨 뒤의 w x y z알파벳은 인덱스가 아닌 해당하는 알파벳을 리터럴로 준다.
		// a b c d e f g h i j k l m n o p q r s t u v w x y z

		Scanner scanner = new Scanner(System.in);
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		// 알파벳 배열
		
		ArrayList<String> list = new ArrayList<>();
		// 인덱스 반환을 위해 ArrayList 사용
		
		for (int i = 0; i<alphabet.length; i++) {
			list.add(alphabet[i]);
		}
		// list에 알파벳 담기
		
		
		System.out.print("암호입력: ");
		String password = scanner.nextLine();
		// 해독 할 암호 받기
		
		String[] arrPw = password.split("");
		// 암호 한 글자 씩 배열에 담기
		
		String[] realPw = new String[arrPw.length];
		// 해독한 암호를 담을 배열 변수 선언. 길이는 암호의 길이만큼
		
		for(int i = 0; i<arrPw.length; i++) {
			String s = arrPw[i]; // 암호 한 글자
			int n = list.indexOf(s);
			// 해독할 암호의 문자열을 알파벳 list에서 인덱스 값을 찾아 n에 담기
			
			if(list.indexOf(n)<22) { // 인덱스의 값이 22이하 이면
				String ss = list.get(n+4); // 인덱스값에 4를 더한 알파벳을 ss에 담는다. (해독)
				realPw[i] = ss; // 해독한 값은 진짜 비밀번호 배열에 넣는다.
				
			} else { // 인덱스의 값이 22이하가 아니라면 아래의 실행문 실행
				switch(list.indexOf(n)) { 
					case 22: // 인덱스 값이 22면
						realPw[i] = "a"; // a로 해독하고 진짜 비밀번호 배열에 넣기
						break; // switch문 탈출
						
					case 23:
						realPw[i] = "b";
						break;
						
					case 24:
						realPw[i] = "c";
						break;
						
					case 25:
						realPw[i] = "d";
						break;
				}
			}
			
		}
		
		for(String s : realPw) {
			System.out.print(s); // 배열에 담은 비밀번호를 연속으로 출력
			
		}
		
		
		
		


	}
}
