package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수롱,박연수 고길동";
//		String[] arr = data1.split("& | ,");// 띄어쓰기 하니까 split 안 됨
		String[] arr = data1.split("&|,| ");// 띄어 쓰기도 구분자니까 or로 구분 지어야 해서 그랬나봐
		for(String token : arr) { // 향상된 for문 헷갈리네
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
