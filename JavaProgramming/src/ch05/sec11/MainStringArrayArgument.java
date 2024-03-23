package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		System.out.println(args.length); 
		//0이 반환 됨  java MainStringArrayArgument 에 매개변수가 없다는 뜻
		// Run -> Run Configurations
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 프로그램 종료하고 싶음
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+result);
		
//		int[] array = {1,2,3};
	}

}