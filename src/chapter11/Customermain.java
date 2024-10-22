package chapter11;

public class Customermain{

	public static void main(String[] args) {
		Customer customer=new Customer();
		
		System.out.println("----Buy----");
		Buy buyer=customer;
		buyer.buy();
		buyer.order();
		
		System.out.println("----Sell----");
		Sell seller=customer;
		seller.sell();
		seller.sellorder();
		

	}

}
