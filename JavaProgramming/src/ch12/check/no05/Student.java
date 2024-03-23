package ch12.check.no05;

public class Student {
	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudent() {
		return studentNum;
	}
	
	// 코드 작성 equals랑 hashcode를 오버라이딩

	@Override
	public boolean equals(Object obj) {
		
		int num = Integer.parseInt(studentNum);
		if (hashCode() == num) {
			return true;
		} else {
			return false;
		}
			
		
	}
	
	@Override
	public int hashCode() {
		
		String hash = getStudent();
		int code = Integer.parseInt(hash);
		return code;
		 
		
	}

}
