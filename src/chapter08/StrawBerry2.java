package chapter08;

public class StrawBerry2 extends Berry {
	private String color;
	private int price;
	//������
	//setter
	public void Set3(String a, int b) {
		color=a;
		price=b;
	}
	//getter
	public void Disp3() {
		System.out.println("���� : "+color);
		System.out.println("���� : "+price);
	}

}
