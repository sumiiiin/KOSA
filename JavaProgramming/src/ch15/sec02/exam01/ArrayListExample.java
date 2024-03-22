package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 컬렉션 객체 생성
		List<Board> list = new ArrayList<>(); // 보드 객체를 담는 리스트 객체 생성
		
		// 객체 저장
		list.add(new Board(1, "제목1", "내용1","글쓴이1",new Date()));
		list.add(new Board(2, "제목2", "내용2","글쓴이2",new Date()));
		list.add(new Board(3, "제목3", "내용3","글쓴이3",new Date()));
		list.add(new Board(4, "제목4", "내용4","글쓴이4",new Date()));
		list.add(new Board(5, "제목5", "내용5","글쓴이5",new Date()));
		
		// 저장된 객체 수
		System.out.println("저장 된 객체 수: " + list.size());
		
		// 2인덱스의 객체 얻기
		Board bd = list.get(2);
		System.out.println(bd);// tostring이 제대로 나오네 -> 롬복이 재정의 했잖아!!
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board);
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);
		// 위에서 지워도 뒤에서 인덱스 땡겨와서 2인덱스는 다시 생기고 또 지울 수 있다.
		
		// 모든 객체를 하나씩 가져오기
		for(Board b : list) {
			System.out.println(b);
		}
		

	}

}
