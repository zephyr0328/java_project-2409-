package chapter03.whiletest;

public class WhileTest01 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			
			System.out.println("�ֻ����� ��: " + num);

			if (num == 6) {
				break;
			}
			/*Math.random() * 6������ * 6�� �����Ǵ� ���� ���� ������ �����ϴ� ������ �մϴ�.
			Math.random()�� 0.0 �̻� 1.0 �̸��� ���� �����մϴ�.
			�� ���� 6�� ���ϸ�, ����� 0.0 �̻� 6.0 �̸��� ���� �˴ϴ�.
			��, �����Ǵ� ���� ������ 0���� 6������ Ȯ��˴ϴ�.
			����, Math.random() * 6�� ����� 0.0 �̻� 6.0 �̸��� �Ǽ� ���� �Ǹ�,
			�̸� ������ ��ȯ�ϰ� 1�� �������ν� ���������� 1���� 6������ ������ ���� �� �ֽ��ϴ�.*/
		}
	}

}
