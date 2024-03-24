package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		int result = this.name.compareTo(o.name); // 원래 String에 있던 비교기능 사용
		// 필드에 있는 값을 메소드로 들어온 값이랑 비교해서
		// 비교 대상 객체 값이 작으면 음수, 같으면 0, 크면 양수를 반환
		// 이러한 반환값을 이용하여 Person 객체를 정렬할 수 있다.
		return result;
	}
	
	
}
