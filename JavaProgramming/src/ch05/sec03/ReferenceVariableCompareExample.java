package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		
		int[] arr1;
		int[] arr2;
		int[] arr3; // 초기화가 아직 안 된 상태
		
		arr1 = new int[] {1, 2, 3}; //new는 객체를 생성하는 것
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); 
		//값이 같다고 true가 나오는게 아니라 참조값이 다르기 때문에 false가 나온다.
		System.out.println(arr1 == arr3);
		System.out.println(arr2 == arr3); // true
	}
 
}
