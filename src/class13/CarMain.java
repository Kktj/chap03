package class13;

/**
 * 메소드 연습용 Car 클래스를 사용하는 실행클래스
 *
 */

public class CarMain {

	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출

		// 주유 메소드 setGas() 호출
		myCar.setGas(10); // 10만큼 주유

		// 기름이 있을 경우 출발
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");

			// 운행 run() 메소드 호출
			myCar.run();
		}

		System.out.println("gas를 주입하세요.");
	}

}
