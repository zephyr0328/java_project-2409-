package chapter05;

import java.util.Scanner;

public class Method {
	//�޼����� �����ε� ���
	//�޼���1.
	void makeBread() {
		System.out.println("���� ����ϴ�.");
	}
	//�޼���2.
	public void makeBread(int cnt) {
		int i;
		for(i=0;i<cnt;++i) {
			System.out.println("��"+i+"��");
		}
		System.out.println("��"+cnt+"���� �ϼ��Ǿ����ϴ�.");
		}
	//�޼���3.
	public void makeBread(int cnt,String str) {
		int j;
		for(j=0;j<cnt;++j) {
			System.out.println(str+"��"+j+"��");
		}
		System.out.println("��û�Ͻ�"+cnt+"����"+str+"���� �ϼ��Ǿ����ϴ�.");
	}
	
	public void order() {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;

		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");
			
			int input_num=Integer.parseInt(scanner.nextLine());
			switch(input_num) {
			case 1:
				System.out.print("�� ������ �Է�: ");
				int cnt1=Integer.parseInt(scanner.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("�� ������ �Է�: ");
				int cnt2=Integer.parseInt(scanner.nextLine());
				System.out.print("���� ���� : ");
				String str=(scanner.nextLine());
				makeBread(cnt2,str);
				break;
			case 3:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
