package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null; 
		// 쓰레기로 만들었지만 바로 메모리 정리를 하진 않음, 메모리가 부족하면 정리하는 편
		// 그래서 굳이 null처리 할 필요는 없다. 어차피 코드 실행이 끝나면 메모리는 정리된다.
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: "+kind2);
		System.out.println(kind1 == kind2); // false가 나옴
	}

}
