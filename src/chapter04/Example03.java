package chapter04;

public class Example03 {

	public static void main(String[] args) {
		// �迭���� �ִ밪�� ã�Ƽ� ���

		int max = 0;
		int array[] = { 1, 6, 9, 2, 35, 178, 234, 4, 5, 11 };

		// for������ if ������ ������ ũ�⸦ ���ؼ�
		// max���� 0�� �迭���� ������ ���� max=array[i];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else {
				continue;
			}
		}
		System.out.println(max);

		System.out.println();

		for (int num : array)
			if (max < num) {
				max = num;
			}
	}

}
