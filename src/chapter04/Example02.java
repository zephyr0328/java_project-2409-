package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		double totalavg = 0;
		int total = 0;
		int alltotal = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				count++;
			}
			alltotal += total;
			avg = (double) total / array[i].length;
			System.out.println((i + 1) + " ���� ��: " + total);
			System.out.println((i + 1) + " ���� ���: " + avg);
			total = 0;
		}
		System.out.println("�� ���� ��" + alltotal);
		totalavg = (double) alltotal / count;
		System.out.println("��ü�� ���" + totalavg);

	}

}
