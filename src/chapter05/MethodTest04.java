																																										package chapter05;

public class MethodTest04 {
	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public static double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

	public static void main(String[] args) {

		int sum = add(5, 10);
		double sumDouble = add(3.5, 7.2);

		System.out.println("합계(int): " + sum);
		System.out.println("합계(Double" + sumDouble);
	}
}
