package chapter16;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerMainEx06 {

	public static void main(String[] args) {
		// ����
		List<TravelCustomer> customer = new ArrayList<TravelCustomer>();

		// ��ü ����
		TravelCustomer customerKim = new TravelCustomer("�����", 19, 35000);
		TravelCustomer customerPark = new TravelCustomer("������", 40, 25000);

		// ��ü�� ���濡 ���
		customer.add(customerKim);
		customer.add(customerPark);
		customer.add(new TravelCustomer("�̼���", 30, 28000));

		System.out.println("==�� ��� �߰��� ������� ���==");
		customer.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println("==20�� ���� ���� ���� �̸��� �����Ͽ� ���");
		customer.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(c -> System.out.println(c));
		System.out.println("==�Ѽ���==");
		int total = customer.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);

	}

}
