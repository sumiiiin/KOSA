package ch12.check.no05;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		// student를 저장하는 hashset작성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		//Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		
		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());

	}

}
