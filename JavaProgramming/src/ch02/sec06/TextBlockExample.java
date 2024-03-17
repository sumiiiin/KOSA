package ch02.sec06;

public class TextBlockExample {

	/*
	 * {
	 * 		"id" : "winter",
	 * 		"name" : "눈송이"
	 * }
	 */
	
	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n"+
				"\t\"name\":\"눈송이\"\n"+
				"}";
		System.out.println(str1); // 주석처럼 나오는데 너무 복잡해
		
		String str2 = """
				{
					"id" : "winter",
					"name" : "눈송이"
				}
				"""; // 텍스트 블록문법으로 이스케이프 문자 없이 적힌 그대로 나옴
		System.out.println(str2); // 주석처럼 나오는데 훨씬 쉬움 근데 자바 13부터 가능

	}

}
