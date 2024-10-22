package chapter11;

public class Carmain {
	
	public static void method(Car c1) {
		c1.run();
	}
	public static void main(String[] args) {
		method(new AiCar());
		System.out.println("------------------------------------------------------------");
		method(new ManualCar());
	}

}
