package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			// 해당 위치에 test1.bd파일 생성됨
			// OutputStream은 추상 클래스로 실질적으로 구현할 수 있는 클래스는 하위 클래스들이다.
			// 이 클래스를 상속 받는 자식은 모두 접미사로 OutputStream이 붙는다.
			// 하위 클래스 중 FileOutputStream은 파일을 생성하거나 이미 존재하는 파일에 기록하거나 추가하거나 덮어 쓸 수 있다.
			// 파일의 내용을 변경하거나 새로운 파일을 작성하는데 사용한다.
			
			
			byte a = 10;
			byte b = 20;
			int c = 300;  // 1byte로 표현할 수 없는 숫자
			// 300 = 100101100인데 여기서 뒤에서 6자리만 저장이 된다.
			// 44 = 101100 -> 44가 나오게 된다.
			
			os.write(a);
			os.write(b);
			os.write(c); // 1바이트씩 출력
			// Buffer에 쌓이고 있음, Buffer가 다 차면 이 내용들이 outputstream으로 출력
			
			os.flush();// 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close(); // 출력 스트림을 닫아 사용한 메모리를 해제 -> buffer, outputstream에 할당 된 메모리 다 해제
			// flush안하고 close안하면 버퍼에 잔류한 데이터가 날아갈 수 있으니, close안에 flush기능이 있다. 
			// 그렇다고 flush를 쓸 상황이 없는건 아냐, 몇개씩 보내고 싶은지 정하고 싶을 때는 쓸수 있음
			// 우린 기계적으로 flush사용하자
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
