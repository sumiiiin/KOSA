package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		Applicant<Person> app1 = new Applicant<>(new Person());
		Course.registerCourse1(new Applicant<Person>(new Person())); // app1이 들어가도 같음
		Course.registerCourse1(new Applicant<Worker>(new Worker())); 
		Course.registerCourse1(new Applicant<Student>(new Student())); 
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent())); 
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent())); 
		
		//registerCourse2(Applicant<? extends Student> applicant)
//		Course.registerCourse2(new Applicant<Person>(new Person())); // Student의 하위만 된다.
//		Course.registerCourse2(new Applicant<Worker>(new Worker())); 
		Course.registerCourse2(new Applicant<Student>(new Student())); 
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent())); 
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent())); 
		
		// registerCourse3(Applicant<? extends Worker> applicant)
//		Course.registerCourse3(new Applicant<Person>(new Person())); 
		Course.registerCourse3(new Applicant<Worker>(new Worker())); // Worker의 상위만 된다.
//		Course.registerCourse3(new Applicant<Student>(new Student())); 
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); 
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); 
	}

}
