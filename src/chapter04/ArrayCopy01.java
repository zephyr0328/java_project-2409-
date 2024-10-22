package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n================");

		for (int arr2 : array2) {
			System.out.print(arr2 + " ");
		}
		System.out.println("\n================");
		
		array1[3]=4;
		// ������ �迭, ������ ù ��ġ, ���迭, �ٿ����� ù ��ġ, ������ ��� ����
		System.arraycopy(array1, 0, array2, 1, 4);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n================");

		for (int arr2 : array2) {
			System.out.print(arr2 + " "); //������ ����� �Ǿ� ������
		}
		System.out.println("\n================");
		
	}

}
