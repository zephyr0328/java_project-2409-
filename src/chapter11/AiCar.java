package chapter11;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("���������� �մϴ�");
		System.out.println("�ڵ����� ������ ������ ��ȯ �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ���� �մϴ�.");
	}

}
