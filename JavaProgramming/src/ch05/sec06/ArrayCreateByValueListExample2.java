package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		
		int[] scores; // 변수 선언
		scores = new int[] {83,90,87}; // 배열 변수에 배열을 대입
		
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//배열을 매개값으로 주고, printItem() 매서드 호출
//		printItem({83,90,87}); // 이렇게 선언하면 안됨
		printItem(new int[] {83,90,87}); // 뭐여 오류나서 프린트아이템 뭐 누르니까 밑에 코드 나옴
		// The method printItem(int[]) in the type 
		// ArrayCreateByValueListExample2 is not applicable for the arguments ()
		
		System.out.println("프로그램 종료");

	}

	private static void printItem(int[] abc) { // 매서드 선언
		// TODO Auto-generated method stub
		for(int i=0; i<abc.length; i++) {
			System.out.println("score[" + i + "]:" + abc[i]);
		}
		
	}

}
