package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {

		try {
			Reader reader = null;
			
			reader = new FileReader("C:/Temp/test.txt"); 
			// 문자 입력 스트림 -> 파일을 읽고 읽어온 데이터를 사용할 수 있다.
			// test.txt 문자 파일 읽을거야
			
			while(true) {
			
				int data = reader.read(); 
				// read메소드는 char 하나씩 읽어서 int로 반환
				// 읽어올거 없으면 -1 반환
				 
				if(data == -1) { // 읽어 올거 없으면 멈춰
					break;
				}
				System.out.println((char)data); 
				// int가 된 data를 char로 강제 타입변환하여 출력 
			}
			
			reader.close();
			System.out.println();
			
			// 문자 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			
			char[] data = new char[100]; // char 100개씩 읽을 배열 생성
			
			while(true) {
				int num = reader.read(data);
				// read 매개값으로 배열 넣기
				// 한번에 100개씩 읽어온 값을 배열에 저장한다.
				if(num == -1) {
					break;
				}
				for(int i =0; i<num; i++) {
					System.out.println(data[i]); // 배열의 값 하나씩 출력
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
