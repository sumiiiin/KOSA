package ch12.check.no09;

import java.util.Arrays;

public class DecodingExample {

	public static void main(String[] args) throws Exception{
		byte[] bytes = {-20, -107, -120, -123, -107};
		String str = new String(bytes, "UTF-8");//bytes배열과 디코딩할 문자셋으로 생성자 선언
		System.out.println("str: " + str);
		
		// 반대로 Str을 바이트 배열로 받기
		
		byte[] arr = str.getBytes();
		System.out.println(Arrays.toString(arr));
		// 근데 왜 갯수랑 값이 다르지?

	}

}
