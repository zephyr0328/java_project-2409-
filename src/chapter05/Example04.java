package chapter05;

public class Example04 {
	public double calculateAverage(int arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i];
		}
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Example04 calculator = new Example04();

		int numbers[] = { 5, 10, 15, 20, 25 };
		double average = calculator.calculateAverage(numbers);
		System.out.println("¹è¿­ÀÇ Æò±Õ: " + average);

	}

}
