package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		
		//Properties 컬렉션 생성
		Properties proper = new Properties();
		try {
			proper.load(PropertiesExample.class.getResourceAsStream("database.properties"));
			// PropertiesExample.class -> 이 클래스 파일이 저장된 메소드 영역의 번지
			// .getResourceAsStream("database.properties") 위의 클래스 파일 있는 위치에서 database.properties이 파일을 가져와
			// database.properties은 설정파일 이기도 함 내용에 따라 동작이 정해지기 때문 -> 다국어 설정같은것도 할 수 있음 
		} catch (IOException e) {
			
		}
		
		String userName = proper.getProperty("username");
		String password = proper.getProperty("password");
		System.out.println(userName + ":" + password);
		
	}

}
