package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// 괄호는 묶어주는거고 02 혹은 010으로 시작하고 하이픈나오고 
		// \\d는 숫자만 들어와야 한단 소리, 숫자는 3개~4개가 나오고 하이픈 나옴
		// \\d는 숫자만 들어오는거고 {4}는 4자리 수가 나와야 한다.
		
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
			
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";// 이메일 정규식
		// \하나만 쓰면 이스케이프 처리가 되어 \w를 온전히 사용 하지 못한다. 그래서 \\두개 씀
		// w는 한개의 알파벳이나 숫자인데 +되어있으니 한개 이상의 알파벳이나 숫자를 의미
		// 이메일에 들어갈 @
		// 마찬가지로 한개 이상의 알파벳이나 숫자 들어간 다음 .찍기
		// 
		data = "angel@mycompanycom";// 점 안찍어서 일부러 틀리게 함
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}