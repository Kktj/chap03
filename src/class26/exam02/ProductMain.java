package class26.exam02;

public class ProductMain {

	public static void main(String[] args) {
		
		Product pro1 = new Product();
		pro1.id = 202103001;
		pro1.name = "냉장고";
		pro1.price = 500;
		pro1.quantity = 5;
		
		
//		System.out.println("id : " + pro1.id);
//		System.out.println("name : " +pro1.name);
//		System.out.println("price : " + pro1.price);
//		System.out.println("quantity : " + pro1.quantity);
//		System.out.println("amount : " + pro1.amount);
		
		System.out.println();
		pro1.showProductInfo();
		System.out.println();
		
		
		
		Product pro2 = new Product(202103001 , "세탁기" , 250 , -15);
		
		pro2.showProductInfo();

	}

}
