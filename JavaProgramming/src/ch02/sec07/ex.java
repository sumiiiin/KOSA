package ch02.sec07;

public class ex {

	public static void main(String[] args) {
		
		char x = 65;
		short a = (short) x;
		
		System.out.println(a);
		
		byte b = -66;
		char y = (char) b;
		System.out.println(y); // 음수인데 강제 변환하니까 되네? 근데 이상한거 나옴 한글나옴
		
		int c = 10;
		int d = 10;
		
		boolean n = c == d;
		System.out.println(n); //True나옴
		// c와 d는 같은 값이지만 저장된 장소(번지)는 다르다 그래서 이 둘이 같다고 비교하면 같다고 할 수 없지만
		// '=='연산자는 값 비교라서 True가 나온다
		// 나중에는 같은 저장소에 저장되어있냐를 따져야 할 때가 나온다.

	}

}
