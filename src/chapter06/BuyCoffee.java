package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		// ��2�� ����
		Customer kim = new Customer("Kim", 12000);
		Customer park = new Customer("park", 10000);
		// ī�� ����
		Cafe cafe = new Cafe("���� ���� ī��");
		// ī��湮
		kim.visitCafe(cafe, 4000);
		park.visitCafe(cafe, 4500);
		// ī������
		cafe.showInfo();
		// ������ ����
		kim.showInfo();
		park.showInfo();
		

	}

}
