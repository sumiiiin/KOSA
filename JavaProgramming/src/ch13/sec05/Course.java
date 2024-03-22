package ch13.sec05;

public class Course {
	
	public static void registerCourse1(Applicant<?> applicant) { // 어떤 타입이던 T대신 다 올 수 있다?
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
		
	public static void registerCourse2(Applicant<? extends Student> applicant) { // Student포함 자식객체만 가능
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2를 등록함");
		

	}
	
	public static void registerCourse3(Applicant<? extends Worker> applicant) { // Student포함 자식객체만 가능
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3를 등록함");
		
	
	}

}
