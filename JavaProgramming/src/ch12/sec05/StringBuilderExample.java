package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
		.append("DEF").insert(0, "ABC").delete(3, 4) //return타입이 StringBuilder타입
		// 위의 메소드들은 연이어서 다른 메소드를 호출 할 수 있다. -> 메소드 체이닝
		
		.toString(); // return타입이 String타입 -> 완성 된 문자열 return
		System.out.println(data);

	}

}
