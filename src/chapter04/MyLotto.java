package chapter04;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		// �ζǹ�ȣ 6���� ���� �迭

		int number;
		int cnt = 0;
		int[] lotto = new int[6];

		System.out.println("===�̹��� �ζ� �����ȣ===");
		number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���."));

		while (number > cnt) {
			System.out.print("\n[" + (cnt + 1) + "]: ");
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {// �ߺ��� �񱳹�
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}//if
				}//for
				System.out.print(lotto[i] + "  ");
			}//for
			cnt++;
		}//while

	}//main

}//class
