package ch11.sec03.exam03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
		for (int i=0; i <= array.length; i++) {
			
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과 됨" + e.getMessage());
			} catch(NullPointerException | NumberFormatException e) { // 두 가지의 예외를 동일하게 처리하라
				System.out.println("숫자로 변환 할 수 없음" + e.getMessage());
				
		}
		}

	}

}
