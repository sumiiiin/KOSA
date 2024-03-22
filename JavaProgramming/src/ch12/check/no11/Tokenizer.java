package ch12.check.no11;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String data = "아이디,이름,패스워드";
		
		StringTokenizer token = new StringTokenizer(data,",");
		
		while(token.hasMoreTokens()) { // StringTokenizer의 메소드로 
			
			System.out.println(token.nextToken());
		}
		
		

	}


}
