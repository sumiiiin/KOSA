package ch05.sec04;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		
		int[] intArray = null;
//		intArray[0] = 10; // NullPointerException
//		System.out.println(intArray);// 이것도 그냥 null이라고 나오네 참조값이 아니라
		
		String str = null;
		System.out.println(str); // null이라고 나옴, 오류x
		System.out.println(str.length()); // NullPointerException
		
		
		
	}

}
