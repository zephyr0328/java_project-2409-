package chapter06;

public class Vanding {
	// �������
	private Can can[] = new Can[5];
	private int money;

	// �⺻������
	// �޼���
	public void init() {
		can[0] = new Can("ȯŸ", 1000);
		can[1] = new Can("�ݶ�", 1100);
		can[2] = new Can("���̴�", 900);
		can[3] = new Can("�������帵ũ", 2000);
		can[4] = new Can("�ھ簭����", 1500);
	}

	// ��밡���� ���Ḹ �����ִ� �޼���
	public void showCans(int m) {
		money = m;
		for (int i = 0; i < can.length; i++) {
			if (money >= can[i].getPrice()) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "��");
			}
		}
	}

	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println("��û�Ͻ�" + can[i].getCanName() + "��(��) �����ϼ̽��ϴ�.");
				System.out.println("�ܾ���" + (money - can[i].getPrice()) + "�� �Դϴ�.");
			}
		}
	}
}
