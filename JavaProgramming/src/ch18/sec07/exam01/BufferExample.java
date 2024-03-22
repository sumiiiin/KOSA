package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws IOException { // jvm에게 떠넘기기
		
		// 원본 파일과 대상 파일의 경로
		String originalFilePath1 = "D:\\KosaCourse\\projects\\JavaProgramming\\src\\ch18\\sec07\\exam01\\cat.jpg";
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		// 역슬래시는 한개가 이스케이프 문자라서 두개이고 슬래시는 하나만 써도 된다. 윈도우에서는 두 버전의 슬래시가 같은 의미다.
		
		String originalFilePath2 = BufferExample.class.getResource("cat2.jpg").getPath(); //
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		
		// 버퍼를 사용하지 않는 입출력 스트림
		InputStream is1 = new FileInputStream(originalFilePath1);
		OutputStream os1 = new FileOutputStream(targetFilePath1);
		
		
		// 버퍼를 사용하는 입출력 스트림
		InputStream is2 = new FileInputStream(originalFilePath2);
		OutputStream os2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		
		
		// 복사 시간 비교하기
		long nonBufferTime = copy(is1, os1);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + BufferTime + "ns");
		
		// 스트림 닫기
		is1.close();
		os1.close();
		bis.close();
		bos.close();
		
		
	}
	
	public static long copy(InputStream is, OutputStream os) throws IOException { 
		//is에서 읽은 데이터를 os로 복사
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1) {
				break;
			}
			os.write(data); // 읽은 내용 바로 출력
		}
		os.flush(); // 다 읽어서 
//		os.close(); // 메소드에서 닫지 않음
		long end = System.nanoTime();
		return(end-start);
	}

}
