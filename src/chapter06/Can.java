package chapter06;

public class Can {

	private String canName;
	private int price;

	public Can() {
	}
	// �����ڸ� ���Ͽ� ������� �ʱ�ȭ
	public Can(String canName, int price) {
		this.canName = canName;
		this.price = price;
	}
	//getters setters
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}

}