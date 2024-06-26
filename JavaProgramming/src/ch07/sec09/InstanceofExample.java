package ch07.sec09;

public class InstanceofExample {
	
	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) { // 매개변수로 person이나 person의 자식 객체를 받아야해
		System.out.println("name: " + person.name);
		person.walk();
//		person.study(); // 안됨 -> 왜?

		//person이 참조하는 객체가 Student 타입인지 확인
		/*if (person instanceof Student) { // person 클래스변수에 있는 객체가 student타입이니?
 			//Student 객체일 경우 강제 타입 변환
 			 * 
 			Student student = (Student) person; // 그럼 person 클래스 타입에 있는 객체를 다시 student로 바꿔
 			//Student 객체만 가지고 있는 필 드 및 메소드 사용
 			 * 
 			System.out.println("studentNo: " + student.studentNo);
 			student.study();
 		}*/

		//person이 참조하는 객체가 Student 타입일 경우
		//student 변수에 대입(타입 변환 발생)
		if(person instanceof Student student) { 
			// person 클래스변수에 있는 객체가 student타입이니? 그럼 person 클래스 타입에 있는 객체를 다시 student로 바꿔
			//자바 12부터 가능한
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
//		Person p1 = new Person("홍길동");
//		personInfo(p1);
		
		personInfo(new Person("홍길동")); // 위의 코드와 동일
		
		System.out.println();

		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
//		Person p2 = new Student("김길동", 10);
//		personInfo(p2);
		
		personInfo(new Student("김길동", 10)); // 위의 코드와 동일
	}
}