package chapter11;
//�߻� Ŭ����
public abstract class Computer {
	
	public abstract void display(); // �߻� �޼��� (body�� ���� �޼���)
	public abstract void typing();
	
	/*
	 * ���踸 �� ���� ���� 
	 */
	
	//�Ϲ� �޼���
	public void turnOn() {
		System.out.println("������ �մϴ�.");//���๮-> �޼����� "�ٵ�"
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
