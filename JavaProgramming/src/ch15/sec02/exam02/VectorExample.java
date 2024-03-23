package ch15.sec02.exam02;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

public class VectorExample {

	public static void main(String[] args) {
		// 컬렉션 객체 생성
		List<Board> list = new Vector<>(); // 공유객체
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board(i, "제목", "내용","글쓴이",new Date()));
					
				}
			}
		};
		
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board(i, "제목", "내용","글쓴이",new Date()));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		// 메인 스레드를 threadA와 threadB가 종료될 때 까지 기다림
		try {
			threadA.join();
			threadA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		//System.out.println(list.get(1504));

	}

}
