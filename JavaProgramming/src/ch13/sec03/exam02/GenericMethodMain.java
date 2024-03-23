package ch13.sec03.exam02;

public class GenericMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowInteger showInt = new ShowInteger(100);
		ShowString showStr = new ShowString("손흥민");
		
		GenericMethodByType byType = new GenericMethodByType();
		byType.<ShowInteger>introduce(showInt);

	}

}
