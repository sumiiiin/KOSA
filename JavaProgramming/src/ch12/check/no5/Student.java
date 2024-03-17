package ch12.check.no5;

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
		boolean result = false;
		if(num == hashCode()) {
			
			result = true;
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		String strNum = getStudent();
		int stuNum = Integer.parseInt(strNum);
		return stuNum;

			
	}
	


}
