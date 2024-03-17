package ch02.sec02;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; // 문자 저장, 작은 따옴표를 사용해야 함
		char c2 = 65; // 유니코드 직접 저장
		
		char c3 = '가'; // 문자 저장, 작은 따옴표를 사용해야 함
		char c4 = 44032; // 유니코드 직접 저장
		
//		char c5 = '가나'; // 문자(알파벳)이 아닌 단어는 문자셋에 없어서 오류나나?
		char c6 = '숦'; // 이건 되네
		char c7 = 'ㄱ'; // 이건 되네 자음은 됨
		char c8 = 'ㅏ'; // 이건 되네 모음도 됨
		char c9 = 45831;
		char c10 = ' '; // 빈 문자는 됨 한칸만 됨 아무것도 없는 것도 안 됨

		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);

	}

}
