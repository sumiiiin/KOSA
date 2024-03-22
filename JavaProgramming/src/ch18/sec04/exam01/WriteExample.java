package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			// 문자 출력 스트림 -> 파일에 내용 저장하고 생성 가능
			
			// 문자 출력
			char a = 'A';
			writer.write(a); // 문자열 쓰기
			
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr); // 배열 쓰기 (현재 ABCDE)
			
			// 문자열 출력
			writer.write("FGH");// 스트링 타입 쓰기-> 제일 많이 사용하는 방식 (현재 ABCDEFGH)
			
			// 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			writer.flush();
			
			// 출력 스트림을 닫고 메모리 해제
			writer.close(); // 리소스 해제
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
