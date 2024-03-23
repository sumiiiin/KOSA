package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "자바";
		
		Box<String> box2 = new Box<>();
		box2.content = "자바";
		
		boolean result = box1.compare(box2);
		System.out.println(result);
		
		Box box3 = new Box<>(); // 타입 선언 안함 여전히 object
		box3.content = "자바"; // 지금 문자열 대입했다고 알아서 String타입으로 바뀐겅미?
		System.out.println(box3.content); // 출력은 자바로 잘 나옴
		System.out.println(box3.content.getClass()); // String으로 바뀜!
		
	}

}

