package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "자바";
		
		Box<String> box2 = new Box<>();
		box2.content = "자바";
		
		boolean result = box1.compare(box2);
		
		Box box3 = new Box<>();
		box3.content = "자바";
		System.out.println(box3.content); // 출력은 자바로 잘 나옴
		// 왜 나오지?
		// 그냥 필드 값 출력했다. 
	}

}