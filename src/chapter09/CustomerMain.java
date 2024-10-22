package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		System.out.println("---------일반고객-----------");
		Customer choiCs = new Customer();
		choiCs.setCustomerName("진혁");

		// 오버로딩된 생성자를 이용한 객체생성
		Customer cs2 = new Customer(1004, "김우진");

		int price = 10000;
		cs2.calePrice(price);
		System.out.println(cs2.showCustomer());

		System.out.println("-------------VIP고객----------------");
		price = 10000;
		VIPcustomer cs3 = new VIPcustomer(1000, "강자성", 1010);
		cs3.calePrice(price);
		System.out.println(cs3.showCustomer());
	}

}
