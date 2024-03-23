package ch12.check.no10;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// 원래코드
//		String str = "";
//		for (int i = 1; i<=100; i++) {
//			str += i; // 문자열에 숫자 더하면 문자열 됨
//		}
//		System.out.println(str);
		
		String str = "";
		for (int i = 1; i<=100; i++) {
			String a = i+"";
			str = new StringBuilder(str).append(a).toString();
//			str = new StringBuilder().append(a).toString(); //왜 str빼면 100이 나올
		}
		System.out.println(str);
	
	}

}
