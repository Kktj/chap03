package class05;

/**
 * 라이브러리 클래스, 도메인 클래스
 * 또다른 생성자를 만듦 - 기본 생성자 안만들어줌
 */

public class Car {
	public Car() { }
	
	// 필드(멤버 변수)
	String color;
	
	// 또다른 생성자
	Car(String co){
		color = co;
		System.out.println("여기는 또 다른 생성자입니다.");
	}
}
