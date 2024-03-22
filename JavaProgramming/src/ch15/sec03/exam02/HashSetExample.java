package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// 컬렉션 생성
		Set<Member> set = new HashSet<>(); // 인터페이스이니까 구현객체 넣어줘
		// 집합 타입은 Member, Member로 생성한 객체만 들어올 수 있다?
		// 즉 Member로 생성한 객체만 들어 올 수 있는 집합객체 생성
				
		// 객체 저장
		Member m1 = new Member("java",30); //멤버객체 생성
		Member m2 = new Member("java",30);
		System.out.println(m1.hashCode() == m2.hashCode());
		System.out.println(m1.equals(m2));
		// 롬복 Data하면 재정의된걸로 출력되어 true가 나온다.
				
		set.add(m1); 
		set.add(m2);
				
		// 저장된 객체 수 
		System.out.println("총 객체 수: " + set.size());
		
	}

}
