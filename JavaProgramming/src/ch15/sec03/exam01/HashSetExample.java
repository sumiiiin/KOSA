package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetExample {
	public static void main(String[] args) {
		// 컬렉션 생성
		Set<String> set = new HashSet<>(); // 인터페이스이니까 구현객체 넣어줘
				
		// 객체 저장
		set.add("Spring");
		set.add("jsp");
		set.add("java");
		set.add(new String("java")); // 다른 객체지만 동등 객체이기에 중복
		set.add("html");
		set.add("asdasd");
				
		// 저장된 객체 수 
		System.out.println("총 객체 수: " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		System.out.println();
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
