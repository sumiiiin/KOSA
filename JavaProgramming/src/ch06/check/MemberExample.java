package ch06.check;

public class MemberExample {
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if (result) {
			System.out.println("로그인이 되었습니다");
		} else {System.out.println("아이디와 비밀번호를 확인하세요");}
	}

}
