package class26.exam01;

public class Car {
	
	String maker;
	String model;
	int cc;
	String color;
	int price;
	int maxSpeed;
	int speed;
	
	public Car() {
	}
	
	
	public Car(String maker , String model , int cc , String color , int price , 
															int maxSpeed , int speed) {
		
		this.maker = maker;
		this.model = model;
		this.cc = cc;
		this.color = color;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		
	}
	
	// 생성된 객체의 정보를 보여주는 메소드[속성에 대한 기능]
	public void showCarInfo() {
		System.out.println("maker : " + this.maker);
		System.out.println("model : " + this.model);
		System.out.println("cc : " + this.cc);
		System.out.println("color : " + this.color);
		System.out.println("price : " + this.price);
		System.out.println("maxSpeed : " + this.maxSpeed);
		System.out.println("speed : " + this.speed);
		
		
	}
	
	

}
