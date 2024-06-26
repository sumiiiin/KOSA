package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
//		for (int i=0; i <= array.length; i++) {
			
			try {
//				int value = Integer.parseInt(array[i]);
//				System.out.println("array[" + i + "]: " + value);
				
				int value = Integer.parseInt(array[1]);
				System.out.println("array[" + 1 + "]: " + value);
				// 숫자로 변환할 수 없는 오류 남
				
				int valuee = Integer.parseInt(array[2]);
				System.out.println("array[" + 2 + "]: " + valuee);
				// 배열 인덱스 초과 됨
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과 됨" + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환 할 수 없음" + e.getMessage());
				
		}
		}

	}

//}
