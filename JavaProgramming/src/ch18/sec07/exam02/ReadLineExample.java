package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws IOException { // 원래 메인에서는 예외를 try로 잡는게 좋다
		
		Reader reader = new FileReader("src/ch18/sec07/exam01/BufferExample.java");
		BufferedReader br = new BufferedReader(reader);
		
		int lineNo = 1;
		
		while(true) {
			String line = br.readLine(); // 한 줄씩 읽음, 버퍼의 효능 
			if(line == null) { // 더 이상 읽을게 없으면 null을 리턴
				break;
			}
			System.out.println(lineNo + "\t" + line); // 한 줄씩 출력 됨
			lineNo++;// 출력할때마다 linenum 1더해
			
		}
		
		br.close();

	}

}
