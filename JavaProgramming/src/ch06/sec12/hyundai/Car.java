package ch06.sec12.hyundai;

import ch06.sec12.hankook.*;
import ch06.sec12.kumho.*;
// import 단축 키 ctrl + shift + o
// 기본적으로 하위 패키지 하나씩 import됨 클래스 하나를 통째로 import하고 싶으면 패키지 뒤에 *붙여야해
// * 붙이는 걸 단축키로 하고 싶으면 책 260p에 있음

public class Car {
	
	// 필드 선언
	SnowTire tire1 = new SnowTire(); // 객체 생성인데 왜 핃드 선언이라고 하는거지?
//	Tire tire2 = new Tire(); // 타이어가 클래스마다 있는데 뭘 해야할지 모름
	ch06.sec12.hankook.Tire tire2 = new ch06.sec12.hankook.Tire(); // 그럼 이렇게 명시해야해
	
	AllSeasonTire tire3 = new AllSeasonTire();
	
	// 생성자 선언
	
	// 메소드 선언

}
