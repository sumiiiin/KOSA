package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		// 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		// 구현객체를 상위 인터페이스에 대입하여 사용하는 이유
		// 1. 나중에 HashMap이 아닌 map의 다른 구현 객체를 대입하기 편하기 위해(다형성, 의존성 낮추기)
		// 2. 코드가 추상화되고 유지보수 쉽다. -> 결국 다른 구현체 대입 할 수 있단 뜻
		
		
		// 엔트리 저장
		map.put("홍길송", 85); // 키는 String타입 값은 int를 넣었지만 박싱해서 Integer타입이 됨
		map.put("홍길동", 80);
		map.put("김자바", 95);
		map.put(new String("홍길동"), 95); //
		map.put("홍길동", 75);
		
		// 저장된 엔트리 수 (키 갯수랑 같은)
		System.out.println("총 Entry 수: " + map.size());
		
		// 키로 값을 얻기
		System.out.println(map.get("홍길동")); // 제일 마지막에 있는 홍길동이 나옴 -> 75
		
		String key = "홍길동";
		int value = map.get(key); // get으로는 Integer가 나오지만 int에 자동 언박싱 됨
		
		// 엔트리를 하나씩 가져와서 키와 값을 출력
		for(Entry<String, Integer> entry : map.entrySet()) { 
			// .entrySet메소드가 map을 set형태로 만들어 줌 원래 map은 iterable이 아니라서 사용 못하는데 이제 된다.
			// 엔트리 객체 생성해서 map에서 가져온 entry하나씩 넣기
			
			String k = entry.getKey(); //key 가져오기
			int v = entry.getValue(); // value 가져오기
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		// 다른 방법으로 키와 값 출력
		for(String k : map.keySet()) { // key를 set형태로 변환하여 String에 대입
			int v = map.get(k); // key값 이용하여 v에 대입
//			map.remove("홍길동"); // 반복문 돌리다가 삭제하면 오류 남
			System.out.println((k + ":" + v));
		}
		System.out.println();
		
		
		// 반복문 돌리다 중간에 삭제해도 Iterator객체를 사용하면 해결할 수 있음
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator(); 
		// 반복자에 엔트리 객체 넣기 = map을 set형태로 만들어서 반복자로 만드는 메소드 호출
		// map은 iterable하지 않아서 iterable한 set으로 바꿔줘야 반복자로 만드는 메소드를 호출 할 수 있다.
		// 즉, Iterator에 대한 참조를 얻기
		
		while(iterator.hasNext()) { // 반복자로 만든 엔트리에서 가져올게 있니? ->true
			Entry<String, Integer> item = iterator.next(); // 가져와
			if(item.equals("홍길동")) { // 
				iterator.remove(); // Entry에서 실제로 지워 짐
			}
		}
		System.out.println("총 객체 수: " + map.size());
		
		

	}

}

