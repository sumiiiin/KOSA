package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringExample {

	public static void main(String[] args) {
		String data = "자바";
		
		//String -> byte 배열(운영체제 마다 다르고 프로그램마다 다름)
		try {
			byte[] arr1 = data.getBytes("UTF-8"); // 그래서 지정
			System.out.println("arr1: "+Arrays.toString(arr1));
			
			String recoveredData = new String(arr1, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 출력: arr1: [-20, -98, -112, -21, -80, -108]
		// 최신 이클립스는 UTF-8

	}

}
