package chapter13;

public class GenericContainerEx04<T> {

	private T[] items; // int i;
	private int count;

	public GenericContainerEx04(int size) {
		items = (T[]) new Object[size]; // cast 명시적형변환 Object가 좀 더 큰범위
		count = 0;
	}

	// 아이템을 추가하는 제네릭 메서드
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

	//object와 다르게 타입 제한을 사용하여 숫자형 데이터에 대한 합계를 구할 수 있음
	public <E extends Number> double sum(E[] numbers) {
		double total = 0;
		for (E number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}// sum
}
