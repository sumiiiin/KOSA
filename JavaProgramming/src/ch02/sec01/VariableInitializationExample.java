package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		
		int value = 3;
		int x = 10;
		
		int result = value + x; 
		// 변수에 답이 없으면 에러 남(he local variable value may not have been initialized)
		
		System.out.println(result);

	}

}
// 이클립스에 오류나면 저장해도 저장 안됨
