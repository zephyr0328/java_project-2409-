package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		int time= (int)(Math.random()*10)+9;
		System.out.println("[����ð�: "+time+"��");
		System.out.print("�� �� : ");
		
		switch (time) {
		case 9: 
			System.out.println("���� ��å�ϱ�~");
			break;
		case 10:
			System.out.println("��ϱ�");
			break;
		case 11:
			System.out.println("�ı�");
			break;
		case 12:
			System.out.println("��Ա�");
			break;
		case 13:
			System.out.println("�����ϱ�");
			break;
		case 14:
			System.out.println("�����ϱ�");
			break;
		case 15:
			System.out.println("�����ϱ�");
			break;
		case 16:
			System.out.println("�����ϱ�");
			break;
		case 17:
			System.out.println("�����ϱ�");
			break;
		case 18:
			System.out.println("��Ա�");
			break;
		default:
			System.out.println("�۶�����!~~~~~");
		}

	}

}
