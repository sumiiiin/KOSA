package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// 컬렉션 생성
		Set<String> set = new HashSet<>(); // 인터페이스이니까 구현객체 넣어줘
		
		// 객체 저장
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add(new String("java")); // 다른 객체지만 동등 객체이기에 중복
		set.add("html");
		set.add("Spring");
		
		// 저장된 객체 수 
		System.out.println("총 객체 수: " + set.size());
		
		// 하나씩 객체 가져오기(방법1)
		for(String item : set) { // 향상된 for문 set부분엔 iterable한 객체만 올 수 있다.
			System.out.println(item);
		}
		System.out.println();
		
		// 하나씩 가져오기 (방법2)
		Iterator<String> iterator = set.iterator();// Set컬렉션의 iterator()메소드로 반복자를 얻는 방법
		// iterator() 메서드가 반환하는 반복자는 String 타입의 요소를 처리할 수 있다.
		// 반복자 객체 생성
		
		while(iterator.hasNext()) { // 가져올 객체가 있니?
			String item = iterator.next(); //set에서 빠지는게 아냐 
			System.out.println(item);
			
			if(item.equals("jsp")) {
				iterator.remove(); //set에서 삭제하는 것 
			}
		}
		
	}

}
