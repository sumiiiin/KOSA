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
		int result = name.compareTo(o.name); // 원래 String에 있던 비교기능 사용
		return result;
	}
	
	
}
