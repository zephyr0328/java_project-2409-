package chapter03.whiletest;

public class WhileTest07 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		//�������� �ϰ� ���ǿ� ����
		do {
			sum += num;
			num++;
		} while (num <= 10);
		System.out.println("1���� 10������ �� : " + sum);

	}

}
