package class02;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스 객체 생성
		Car myCar = new Car(); // new 연산자를 통해서 객체 생성    
		
		myCar.color = "빨간색";	// 색상 정보 저장(색상 필드에 값 할당)
		
		System.out.println("자동차의 색상은 : " + myCar.color + "입니다."); // 도트연산자

	}

}
