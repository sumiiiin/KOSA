package ch06.sec08.exam02;

public class CallbyvalueVsCallbyReference {

	public static void main(String[] args) {
		
		int value1 = 1;
		int[] value2 = {1};
		
		callByValue(value1);
		System.out.println("value1: " + value1);
		
		callByReference(value2);
		System.out.println("value2: " + value2[0]);
		
		Member member = new Member("홍길동");
		System.out.println("name: " + member.name);
		callByReference(member);
		System.out.println("name: " + member.name);

	}
	
	public static void callByValue(int arg) { 
		// arg는 매개변수 int arg = value1; 과 같다.
		// arg가 바뀌어도 value1이 바뀌진 않는다.
		arg = 2;
	}
	
	public static void callByReference(int[] arg) {
		arg[0] = 2; // arg가 참조하는 배열에 값을 2로 바꿔
		// value2도 같은 번지를 참조하니까 변경된 2가 나온다. 
	}
	
	public static void callByReference(Member arg) {
		arg.name = "감자바";
	}

}
