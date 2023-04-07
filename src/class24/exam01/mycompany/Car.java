package class24.exam01.mycompany;

import class24.exam01.hankook.SnowTire;
import class24.exam01.hyundai.Engine;
import class24.exam01.kumho.BigWidthTire;


public class Car { // 라이브러리 클래스
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire tire10 = new Tire();	같은 클래스 타입으로 두개의 import가 안된다. 
	// Tire tire11 = new Tire();	사용하려면 아래처럼 복잡하게 작성
	
	class24.exam01.kumho.Tire tire3 = new class24.exam01.kumho.Tire();
	class24.exam01.hankook.Tire tire4 = new class24.exam01.hankook.Tire();
	
	public static void main(String[] args) {
		Car myCar = new Car();
	}
	
	

}
