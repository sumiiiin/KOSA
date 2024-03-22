package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db"); 
			// 추상 클래스로 하위 클래스를 생성해서 부모 클래스에 타입 변환하여 사용한다.
			// 입력 스트림은 파일의 내용에 영향을 주지 않으며 내용을 읽어오기만 한다.
			// 읽어온 내용을 메모리에 로드하여 사용 할 수 있다.
			// 프로그램에 파일의 내용을 input한다고 생각하자
			
			while(true) { // 반복문 시작
			
				int data = is.read(); 
				// read메소드는 입력 스트림에서 읽을게 있으면 1byte씩 읽고 4byte로 반환한다.
				// 입력 스트림에서 가져온 바이트 수 만큼 실행해야 전부를 가져올 수 있다.
				// 더 이상 읽을게 없다면 -1을 반환한다.
				// 이 메소드도 예외처리가 필수다.
				
				if(data == -1) break; // 더 이상 가져올게 없다면
				System.out.println(data);
					
			}
		} catch (FileNotFoundException e) {
				
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		


		}
}
