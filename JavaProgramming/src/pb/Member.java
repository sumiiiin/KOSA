package pb;

public class Member {
	
	//feild
	
	private String name;
	private String phoneNum;
	private String major; // 생성자에서 받지 않기
	private String email;
	private String birth; // 생성자에서 받지 않기
	
	//Constructor
	Member(String name, String phoneNum, String major, String email, String birth){
		this.birth = birth;
		this.email = email;
		this.name = name;
		this.major = major;
		this.phoneNum = phoneNum;
				
	}
	
	Member(String name, String phoneNum,String email) {
		this.email = email;
		this.name = name;
		this.phoneNum = phoneNum;
		
		 
	}
	
	//method
	

}
