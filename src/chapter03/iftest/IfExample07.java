package chapter03.iftest;

import java.util.Scanner;



public class IfExample07 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String ID = "soldesk";
		int PW = 240910;
		
		System.out.println("���̵� : ");
		String id = scanner.nextLine();
	
		if (ID.equals(id)) {
			// ��й�ȣ
			System.out.println("��й�ȣ : ");
			int pass = scanner.nextInt();
			if (PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
			}
		}else {
			System.out.println("���� ���̵� �Դϴ�.");
		}
		scanner.close();
	}

}
