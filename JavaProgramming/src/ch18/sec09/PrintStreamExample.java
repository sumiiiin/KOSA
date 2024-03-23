package ch18.sec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws FileNotFoundException {
		
		// 바이트 스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		// 보조 스트림에 연결
		// 프린트 메소드 사용하는 방법처럼 파일에 내용 저장하기
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
		ps.printf("| %6d | %-10s | %10s | \n", 2, "감자바", "학생");
		// 파일 열어보면 이렇게 저장 되어 있음
		ps.flush();
		ps.close();
	}

}
