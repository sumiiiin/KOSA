package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateInputOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		// dataOutputStream 생성 바이트 스트림
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos); 
		// 
		
		// 기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		// 문자열 실수 정수가 한세트 -> 출력한 순서와 동일하게 나중에 읽어야 함
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		// for문 돌려서 읽을거라 위 코드랑 순서 맞춤
		
		dos.flush();
		dos.close();
		fos.close(); 
		// dos에서 닫아서 fos에선 따로 닫아주지 않아도 되는데 명시적으로 사용함
		
		// DataInputStream 생성 -> 바이트 스트림
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		// 보조 스트림 연결
		
		// 기본 타입 입력
		for(int i=0; i<2; i++) { // 출력 순서대로 for문 셋팅, 두세트 써서 두번 돌기
			String name = dis.readUTF(); // 읽은 내용을 변수에 저장
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + " : " + score + " : " + order);
		}

		dis.close(); fis.close();
		// 입력스트림(읽기기능)은 flush 없음
	}

}
