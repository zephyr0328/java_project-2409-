package chapter03.iftest;

import javax.swing.JOptionPane;

public class Ifexample04 {

	public static void main(String[] args) {
		/*
		 * ���ð��� ������ ������ �Ƶ��� 1000�� ->7
		 * ���ð��� ������ �ʵ��л��� 2000��->13 
		 * ���ð��� ������ ��,����л��� 3500��
		 * ���ð��� ������ ������ 5000��->19 
		 */

		int age;
		int charge;

		age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));

		if (age >= 20) {
			charge = 5000;
			System.out.println("���ð��� ������" + charge + "�� �Դϴ�.");
		} else if (age >= 14) {
			charge = 3500;
			System.out.println("���ð��� ������" + charge + "�� �Դϴ�.");
		} else if (age >= 8) {
			charge = 2000;
			System.out.println("���ð��� ������" + charge + "�� �Դϴ�.");
		} else if (age <= 0) {
			System.out.println("���̸� �ٽ� �Է��� �ּ���.");
		} else {
			charge = 1000;
			System.out.println("���ð��� ������" + charge + "�� �Դϴ�.");
		}

	}

}
