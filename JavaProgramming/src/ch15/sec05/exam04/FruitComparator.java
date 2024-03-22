package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) { // 어떤 기준으로 비교할 건지 재정의 해야 해
		if(o1.price > o2.price) {
			return 1;
		} else if (o1.price == o2.price) {
			return 0;
		} else {
			return -1;
		}
		
	}
	
}
