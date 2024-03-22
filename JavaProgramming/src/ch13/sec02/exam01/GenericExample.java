package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		// K는 Tv객체 대입, M은 String으로 대입
		// 객체 생성할 때 꼭 지정해야해
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 매개 값은 반드시 TV와 String을 제공
		product1.setKind(new Tv()); // setter에 Tv객체 매개 값 전달
		product1.setModel("스마트 Tv"); // setter에 문자열 매개 값 전달
		
		//Getter 리턴 값은 Tv와 String이 됨
		Tv tv = product1.getKind(); // kind 필드에 저장한 tv객체를 Tv클래스에 대입 
		String tvModel = product1.getModel(); // model 필드에 저장한 문자열 tvModel에 대입
		//------------------------------------------------------------------------
		//K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<>(); // 
					
		//Setter 매개값은 반드시 Car와 String을 제공
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
				
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
