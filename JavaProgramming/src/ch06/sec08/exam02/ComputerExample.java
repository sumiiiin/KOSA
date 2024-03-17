package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int[] arr1 = {10, 20, 30};

		int result1 = myCom.sum1(arr1);
		System.out.println(result1);
		
//		int result2 = myCom.sum1({1,2,3,4}); // 오류 바로 배열을 넣으면 안된다. 이미 객체에서 배열변수에 선언을 해서?
		int result3 = myCom.sum1(new int[] {1,2,3,4}); //  이렇게 해야 된다.
		System.out.println(result3);
		
//		int result4 = myCom.sum1(1,2,3,4); // 안 된다.
//		System.out.println(result4);
		
		int[] arr2 = {10, 20, 30};

		int result5 = myCom.sum2(arr2);
		System.out.println(result1);
		
//		int result2 = myCom.sum1({1,2,3,4}); // 오류 바로 배열을 넣으면 안된다. 이미 객체에서 배열변수에 선언을 해서?
		int result6 = myCom.sum2(new int[] {1,2,3,4}); //  이렇게 해야 된다.
		System.out.println(result6);
		
		int result7 = myCom.sum2(1,2,3,4); // 안 된다.
		System.out.println(result7);

	}

}
