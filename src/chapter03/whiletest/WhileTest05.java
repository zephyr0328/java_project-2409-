package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Java  ������ ������ �Է��ϼ��� : ");
			int scr = scanner.nextInt();

			// if => 60�� �̻��̸� �հ� �� �ۿ� ���հ�
			// 0 ���� �Ǵ� 100�ʰ��� 0�������� 100������ ������ �Է� �����մϴ�.
			// ||or ������
			if (scr>=60&&scr<=100) {
				System.out.println("�հ�\n");
				break;
			} else if(scr>=0&&scr<60){
				System.out.println("���հ�\n");
				break;
			}else {
				System.out.println("0~100������ ������ �Է� �����մϴ�.");
				break;
			}

		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}
