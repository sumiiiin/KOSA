package ch15.sec05.exam01;

import java.util.TreeSet;

//import ch15.sec03.exam02.Member;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Tree Set 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>(); 
		// 
		
		// 객체 저장 -> Integer이기 때문
//		scores.add("ghd",87);
//		scores.add("dhd",87);
//		scores.add("gdd",87);
		scores.add(51);
		scores.add(12);
		scores.add(78);
		scores.add(94);
		
		for(int score : scores) {
			System.out.println(score); // 올림차순으로 정렬 됨
		// 이진 트리 안에 저장이 되어 
		}
		
		//TreeSet이 가지고 있는 메소드
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 낮은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 아래 점수: " + scores.higher(95));
		System.out.println("95점이거나 (or)바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 (or)바로 위 점수: " + scores.ceiling(85));
		
		
		// 하나씩 객체를 올림차순으로 가져오기
		for(int score : scores) {
			System.out.println(score);
		}
		
		System.out.println();
		
		// 하나씩 객체를 내림차순으로 가져오기
		for (int score : scores.descendingSet()) {
			System.out.println(score);
		}
		
		System.out.println();
		
		// 범위 검색 (80 <= score)
		for(int score : scores.tailSet(80,true)) {
			System.out.println(score);
		}
		
		// 범위 검색 (80 <= score > 90)
		for (int score : scores.subSet(80,true,90,false)) {
			System.out.println(score);
		}
		

	}

}
