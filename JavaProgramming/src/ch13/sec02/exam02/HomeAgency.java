package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{

	public static void main(String[] args) {
		
		

	}

	@Override
	public Home rent() {
		
		return new Home();
	}


}
