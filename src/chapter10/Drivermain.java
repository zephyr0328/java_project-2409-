package chapter10;

public class Drivermain {

	public static void main(String[] args) {
		Driver obj = new Driver();
		/* Vehicle bus=new Bus();
		 * obj.driver(bus); 를 한 줄로 줄이면 아래처럼 된다.
		 */
		obj.drive(new Bus());
		obj.drive(new Taxi());
	}

}
