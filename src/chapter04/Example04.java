package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// ����ڿ��� �ε����� �˰���� ���ڸ� 1�������� 10���� �Է� �޾�,
		// �ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		// ��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.

		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6 };
		int target;
		int index = -1;
		// �迭 ������ ã�� ������ ��� �ʱ�ȭ.

		Scanner scanner = new Scanner(System.in);

		System.out.print("�˰���� ���ڸ� 1���� 10���̷� �Է��ϼ���: ");
		target = scanner.nextInt();
		for (int i = 1; i <= numbers.length; i++) {
			if (numbers[i - 1] == target) {
				index += i;
			} else {
				continue;
			}
		}
		if (index != -1) {
			System.out.println(index + "�ε����� �ֽ��ϴ�.");
		} else {
			System.out.println("�ε����� ã�� �� �����ϴ�.");
			index = -1;
		}
		scanner.close();
		/*for(int i=0;i<numbers.length;i++){
			if(numbers[i] == target) {
				index=i; //���� ���ڸ� ã���� ���� �����
				break;
			}
		}
		if(index!=-1){
		 System.out.println(target+"��(��) "+index+"��° index�� ����.");
		 }else{
		 System.out.println("�����ͺ��̽��� �������� �ʴ� �����Դϴ�.");
		 }
		*/
	}

}
