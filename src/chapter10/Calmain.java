package chapter10;

public class Calmain {
	
	public int Cal(CalculatorExample c1, int a, int b) {
		return c1.getResult(a, b);
	}

	public static void main(String[] args) {
		int sum;
		int dif;
		CalculatorExample plus = new CalPlus();
		CalculatorExample minus = new CalMinus();

		sum = plus.getResult(15, 15);
		dif = minus.getResult(30, 15);
		

		System.out.println("CalPlus : " + sum);
		System.out.println("CalMinus : " + dif);
		
	}

}
