package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) {
		
		try {
			write("문자 변환 스트림을 사용합니다."); // 변환 할 문자열
			
			String data = read();
			System.out.println(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	
	}
	
	public static void write(String str) throws Exception { // 이 메소드를 호출하는 코드에게 예외 떠넘기기
		OutputStream os = new FileOutputStream("C:/Temp/test.txt"); // 파일 생성 or 이미 있는 파일 수정
		Writer writer = new OutputStreamWriter(os, "UTF-8"); 
		// outputstream의 write는 문자열을 .getbytes()메소드를 사용하여 바이트로 변환해야 출력(저장)할 수 있는데
		// writer를 자격을 얻어 문자스트림 처럼 문자열을 쉽게 저장할 수 있다.
		
		writer.write(str); // 바로 문자열 자체를 쓰고 저장 할 수 있다.
		
		writer.flush();// 문자열 넣고 잔류버퍼 비우기
		writer.close();// 출력 스트림 닫기
	}
	
	public static String read() throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		// inputstream의 read는 파일의 문자열을 바이트로 변환해야 읽을 수 있는데
		// reader를 자격을 얻어 문자스트림 처럼 문자열을 쉽게 읽을 수 있다.
		
		char[] data = new char[100]; // 한번에 이만큼 읽기
		int num = reader.read(data); // 읽은 갯수 반환
		reader.close();
		
		String str = new String(data, 0,num);
		// char배열 처음부터 읽은 갯수 만큼 str에 대입
		return str;
	}

}
