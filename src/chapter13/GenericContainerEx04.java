package chapter13;

public class GenericContainerEx04<T> {

	private T[] items; // int i;
	private int count;

	public GenericContainerEx04(int size) {
		items = (T[]) new Object[size]; // cast ���������ȯ Object�� �� �� ū����
		count = 0;
	}

	// �������� �߰��ϴ� ���׸� �޼���
	public void additem(T item) {
		if (count < items.length) {
			items[count++] = item;
		} else {
			System.out.println("Container is full");
		}
	}// additem

	public void printItem() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i] + " ");
		}
		System.out.println();
	}

	//object�� �ٸ��� Ÿ�� ������ ����Ͽ� ������ �����Ϳ� ���� �հ踦 ���� �� ����
	public <E extends Number> double sum(E[] numbers) {
		double total = 0;
		for (E number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}// sum
}
