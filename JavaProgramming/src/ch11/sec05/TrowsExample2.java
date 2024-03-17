package ch11.sec05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrowsExample2 {

	public static void main(String[] args)  throws NullPointerException, IOException{
		method();
		
		System.out.println("hello");
		
		
		
	}
	
	public static void method() throws NullPointerException, IOException{
		FileInputStream fis = null; // null 꼭 해야하네 자동 초기호 ㅏ안됨
		
		try {
			fis = new FileInputStream("C:/Temp/a.txt");
		} catch(IOException e) {
			System.out.println("예외처리: " + e.toString());
		}
		
		try {
			fis.read();
		} catch(NullPointerException e) {
			System.out.println("예외처리: " + e.toString());
		}
	}

}
