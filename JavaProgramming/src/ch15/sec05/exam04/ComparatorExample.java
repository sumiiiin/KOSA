package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator()); 
		// Fruit비교자 없음 예외 남
		
		treeSet.add(new Fruit("포도", 30000));
		treeSet.add(new Fruit("수박", 35000));
		treeSet.add(new Fruit("딸기", 40000));
		treeSet.add(new Fruit("사과", 10000));
		treeSet.add(new Fruit("키위", 70000));
		
		for(Fruit fruit : treeSet.descendingSet()) { //내림차순 메소드
			System.out.println(fruit);
		}
	}

}
