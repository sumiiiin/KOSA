package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		//ver1
		int v1 = 15;
		
		if(v1 > 10) {
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
		}
//		int v3 = v1 + v2 + 5; // v2는 중괄호 안에서 선언되어서 사용 못함
//////////////////////////////////////////////////////////////////////
		
		// ver2
		int v11 = 15;
		int v22 = 0; // 선언을 상위 괄호에서 함, 초기화 해야함
		 
		if(v11 > 10) {
			v22 = v11 - 10;
		}
		int v33 = v11 + v22 + 5;
	}

}
