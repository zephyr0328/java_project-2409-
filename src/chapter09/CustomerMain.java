package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		System.out.println("---------�Ϲݰ�-----------");
		Customer choiCs = new Customer();
		choiCs.setCustomerName("����");

		// �����ε��� �����ڸ� �̿��� ��ü����
		Customer cs2 = new Customer(1004, "�����");

		int price = 10000;
		cs2.calePrice(price);
		System.out.println(cs2.showCustomer());

		System.out.println("-------------VIP��----------------");
		price = 10000;
		VIPcustomer cs3 = new VIPcustomer(1000, "���ڼ�", 1010);
		cs3.calePrice(price);
		System.out.println(cs3.showCustomer());
	}

}
