package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample06 {

	public static void main(String[] args) {
		// �����ͼ�
		String ID = "soldesk";
		int PW = 204910;

		// ��
		String id = JOptionPane.showInputDialog("���̵�");
		

		if (ID.equals(id)) {
			// ��й�ȣ
			int pass = Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));
			if (PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
			}
		}else {
			System.out.println("���� ���̵� �Դϴ�.");
		}

	}

}
