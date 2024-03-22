package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");		
			
			byte[] data = new byte[100]; 
			// data는 길이가 100인 바이트 배열
			// 파일을 읽어오기 위해 배열을 생성
			
			
			while(true) {
				int num = is.read(data); 
				// 한번에 data의 길이만큼 저장하고 num은 읽은 byte의 갯수를 담는다.
				// 읽을 게 없으면 -1 리턴
				
				System.out.println(num);
				// 읽은 갯수 출력
				
				if(num == -1) break;
				// 만약 num이 -1이면 while문 탈출
				for(int i = 0; i<num; i++) { 
					// 읽은 byte의 갯수만큼 반복
					System.out.println(data[i]);
					// 배열에 저장한 값 출력
				}
				
			}
			
			is.close();
			
				
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}	 

	}

}
