package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int cnt, num;
		boolean run = true;
		String str = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");
			num =Integer.parseInt(scanner.nextLine());

			if (num > 0 && num <= 3) {
				switch (num) {
				case 1:System.out.print("���� ������ �Է��ϼ���: ");
					cnt=Integer.parseInt(scanner.nextLine());
					int i;
					for(i=0;i<cnt;++i) {
						System.out.println("��"+i+"��");
					}
					System.out.println("��"+cnt+"���� �ϼ��Ǿ����ϴ�.");
					break;
				case 2:System.out.print("���� �����Է� : ");
					cnt=Integer.parseInt(scanner.nextLine());
					System.out.print("���� ���� : "	);
					str=scanner.nextLine();
					int j;
					for(j=0;j<cnt;++j) {
						System.out.println(str+"��"+j+"��");
					}
					System.out.println("��û�Ͻ�"+cnt+"����"+str+"���� �ϼ��Ǿ����ϴ�.");
					break;
				case 3:
					run = false;
					break;
				}
			} else {
				System.out.println("�ٽ� �����ϼ���.");
			}

		} // while
		System.out.println("���α׷� ����");
		scanner.close();
	}// main

}// class
