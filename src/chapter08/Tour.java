package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �� : ");
		int n = scanner.nextInt(); // 3
		boolean run = true;
		// �ʱ�ȭ�� ���ؼ� �޸� Ȯ�� �� ������(Guide�� ��ü)
		Guide guide = new Guide(n);

		// ������ ���
		System.out.println("������ ���");
		for (int i = 0; i < n; i++) {
			System.out.print("�̸� : ");
			guide.guest[i].setName(scanner.next());
			System.out.print("���� : ");
			guide.guest[i].setGender(scanner.next());
			System.out.println("--------------------------");
		}
		while (run) {
			System.out.println("1. ������ ����");
			System.out.println("2. ������ ����");
			System.out.println("3. ����");
			System.out.print("����>");
			int m = scanner.nextInt();
			switch (m) {
			case 1:
				for (int j = 0; j < n; j++) {
					System.out.println((j + 1) + ".");
					System.out.println("�̸� : " + guide.guest[j].getName());
					System.out.println("���� : " + guide.guest[j].getGender());
					System.out.println("������ : " + Guide.getPoint());
				}
				System.out.println("------------------------------");
				break;
			case 2:
				System.out.print("���� �����Ͻðڽ��ϱ� : ");
				Guide.point = scanner.next();
				System.out.println(Guide.getPoint() + "�� ����������");
				System.out.println("------------------------------");
				break;
			case 3:
				System.out.println("����");
				
				return;
			}scanner.close();
		}
	}
}
