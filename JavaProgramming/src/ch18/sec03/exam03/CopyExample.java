package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args)  throws Exception{
		
		String originalFileName = "C:/Temp/test.jpg";// 복사 할 파일 
		String targetFileName = "C:/Temp/test2.jpg";//  붙여넣기할 파일 위치와 이름 짓기
		
		InputStream is = new FileInputStream(originalFileName); // 복사할 파일
		OutputStream os = new FileOutputStream(targetFileName); // 붙여넣기 할 파일
		
		byte[] data = new byte[1024]; // 1024바이트씩 읽겠다.
		
		while(true) {
			int num = is.read(data); // 복사할 파일 read
			if(num == -1) {break;} // 더 읽을 게 없으면 while문 탈출
			os.write(data, 0, num); //data에서 읽은 바이트 값을 처음부터 끝까지 저장해 
		}
		
		os.flush(); // 버퍼 속 잔류데이터 모두 보내서 비우기
		os.close(); // 붙여넣기 한 파일 출력 스트림 닫기 리소스 해제
		is.close(); // 복사한 파일 입력 스트림 닫기 리소스 해제
		
		System.out.println("복사가 잘 되었습니다.");

		

	}

}
