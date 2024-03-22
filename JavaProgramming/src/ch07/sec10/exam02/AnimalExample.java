package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal anm = new Cat("한국고양이","노랑");
//		anm.breathe(); 
//		anm.sound(); // 야옹
////		cat.catchMouse();
//		System.out.println(anm.color);
//		
//		
//		anm = new Dog("진돗개","흰색");
//		anm.breathe();
//		anm.sound(); // 왈왈
////		anm.keepHouse();
		
		dailyLife(new Cat("한국고양이","노랑"));
		dailyLife(new Dog("진돗개","흰색"));
		
		if(anm instanceof Cat cat) {
			cat.catchMouse();
		}
		
		if(anm instanceof Dog dog) {
			dog.keepHouse();
		}
	}
	
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound();
		
		
		
	}

}
