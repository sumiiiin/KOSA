package ch12.sec03.exam05;

//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data // 데이터 관련 -> 제일 많이 씀

//@AllArgsConstructor // 필드의 값을 전부 매개변수로 생성자 선언
//@NoArgsConstructor // 기본 생성자 선언
//@RequiredArgsConstructor // 필요하다면 생성해 -> 기본 생성자 생성하고 nonnull같은거 있으면 매개변수로 받는 생성자도 선언
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
public class Member {
	
	private String id;
	private String name;
//	@NonNull private String name; // null이 될 수 없다.
	private int age;

}
