package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
	
public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			// 이 위치에 파일이 생긴다.

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array, 1, 3); // 1인덱스 부터 3개만 파일로 출력

			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}