package chapter15;

public class Account {

	int balance = 100000; // �ܾ�

	// ��ݸ޼���
	public synchronized void withdraw(int money) {

		if (balance < money) {
			try {
				wait();// �����尡 �Ͻ������� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance -= money;
	}

	// �Աݸ޼���
	public synchronized void deposit(int money) {

		balance += money;
		notify();//������� ������ ����

	}
}
