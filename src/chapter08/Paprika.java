package chapter08;

public class Paprika extends Vegetable {

	private String color;
	private int price;
	private String name;

	public void set2(String a, int b, String c) {
		color = a;
		price = b;
		name = c;
	}

	public void Disp1() {
		System.out.println("--------Vegetable----------");
		System.out.println("�з�: " + sort);
		System.out.println("����: " + season);
		// �θ� Ŭ������ �⺻ ������(super)�� �̿��� ����
		System.out.println("�̸�: " + super.name);
	}

	public void Disp2() {
		System.out.println("--------paprika----------");
		System.out.println("����: " + color);
		System.out.println("����: " + price);
		System.out.println("�̸�: " + name);
	}
}
