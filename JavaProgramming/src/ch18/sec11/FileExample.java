package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws IOException {
		  
		//File 객체 생성
		File dir = new File("C:/Temp/images"); // 디렉토리 경로
//		File dirr = new File("F:/Temp/images"); 
		// 없는 드라이브에 만들었더니 예외도 없고 드라이브가 생성되지도 않음
		File file1 = new File("C:/Temp/file1.txt"); // 파일 경로
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) { dir.mkdirs(); } 
		// 객체의 경로가 없으면 디렉토리 만들어라
		
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		// 경로에 해당하는 파일이 없으면 파일을 만들어라
		
		//Temp 폴더의 내용을 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		// 해당 디렉토리에 포함 된 파일 및 서브 디렉토리 목록 전부 File배열로 리턴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		// 날짜 형식 선언
		
		for(File file : contents) { // 배열에 있는 파일 하나하나
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			// 마지막 수정 날짜 및 시간 리턴, 날짜형식에 맞춰 출력
			if(file.isDirectory()) { // 만약 디렉토리라면
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
				// 디렉토리안에 파일 이름을 출력
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
				// 파일의 크기와 파일의 이름 출력
			}
			System.out.println();
		}
	}

}

