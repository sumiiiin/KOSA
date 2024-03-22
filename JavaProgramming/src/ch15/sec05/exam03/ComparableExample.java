package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 25));
		// Exception in thread "main" java.lang.ClassCastException: 
		//class ch15.sec05.exam03.Person cannot be cast to class java.lang.Comparable (ch15.sec05.exam03.
		//Person is in unnamed module of loader 'app'; java.lang.Comparable is in module java.
		// Comparable comparable = (Comparable) Person; // 위의 예외는 이 코드가 실현되지 않는다는 예외이다.
		treeSet.add(new Person("김길동", 55));
		treeSet.add(new Person("감길동", 21));
		treeSet.add(new Person("이길동", 85));
		
		for(Person person : treeSet) {
			System.out.println(person.name);
		}
		
		

	}

}
