package ch06.sec07.exam02;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 선언
	Korean(String n, String s){
		name = n;
		ssn = s;
//		
		System.out.println(nation+name+ssn); // 이건 출력 안됨...
	}

}
