package ch15.sec03.exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
//		for (String item : list) {
////			String item = list.get(i);
//			if(item.equals("C")) {
//				list.remove(item);
//			}
//		} // 이렇게 쓰지 말고 
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if(item.equals("C")) {
				iterator.remove();
			}
		} // 이렇게 사용해야 중간에 리스트 속 객체를 삭제해도 오류 없이 반복자가 제대로 반복함
		System.out.println("총 객체 수: " + list.size());
	}
	

}
