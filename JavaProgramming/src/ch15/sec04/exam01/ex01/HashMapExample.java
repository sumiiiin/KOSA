package ch15.sec04.exam01.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		// 컬렉션 생성
		Map<Member, Integer> map = new HashMap<>();
		
		// 엔트리 저장
		map.put(new Member("홍길송",54), 85); 
		map.put(new Member("홍길송",54), 55);
		map.put(new Member("홍길송",54), 25);
		map.put(new Member("홍길송",44), 65); // 이건 동등객체가 아님
		
		// 근데 롬복 데이터로 재정의 안하면 다 다른 객체로 나옴
		
		// 저장된 엔트리 수 (키 갯수랑 같은)
		System.out.println("총 Entry 수: " + map.size());
			

	}

}

