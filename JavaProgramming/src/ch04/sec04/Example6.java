package ch04.sec04;

public class Example6 {
	public static void main(String[] args) {
		
		String star = "*";
		
		for (int i=0;i<=4;i++) { //i는 1~5까지 1씩 늘어납니다.
			
			 for(int j=0; j<=i; j++) {
												 // i는 처음 실행되면 j가 반복하기 다 전까진 반복하지 않고 값을 유지합니다.
												 // i = 0, j = 0
												 // i = 1, j = 0
												 // i = 1, j = 1
												 // i = 2, j = 0
												 // i = 2, j = 1
												 // i = 2, j = 2 ...
				 								 // i는 개행의 횟수, j를 별을 찍는 횟수입니다.
				 								 // j가 i만큼의 별을 찍으면 개행을 하게 됩니다.
				 
				 System.out.print(star);
				 
			 }System.out.println(" ");
		}
		
	}

} // 별 찍는 코드
