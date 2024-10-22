
package chapter09;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}

	public static void main(String[] args) {
		SportCar ac = new SportCar();

		ac.speedUp();
		ac.speedUp();
		ac.speedUp();
		ac.speedUp();
		ac.stop();
	}

}
