package chapter03.switchtest;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������:������, ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų� 
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("������ �Է��ϼ��� (1~7): ");
        
        // ����� �Է� �ޱ�
        int day = scanner.nextInt();
        String food="�߸��� �Է�";
        String date="�߸��� �Է�";

        // switch ���� ����Ͽ� ���Ͽ� ���� ���� ����
        switch (day) {
            case 1:
                food = "������";   // ������
                date = "��";
                break;
            case 2:
                food = "���İ�Ƽ"; // ȭ����
                date = "ȭ";
                break;
            case 3:
                food = "ġŲ";     // ������
                date = "��";
                break;
            case 4:
                food = "����";     // �����
                date = "��";
                break;
            case 5:
                food = "�Ұ��";   // �ݿ���
                date = "��";
                break;
            case 6:
                food = "�ܹ���";   // �����
                date = "��";
                break;
            case 7:
                food = "�ʹ�";     // �Ͽ���
                date = "��";
                break;
            default:
                food = "�߸��� �Է��Դϴ�. 1���� 7 ������ ���ڸ� �Է��ϼ���.";
                break;
        }

        // ��� ���
        System.out.println(date+"���Ͽ� ���� ����: " + food);
        
        scanner.close();
    }
}
