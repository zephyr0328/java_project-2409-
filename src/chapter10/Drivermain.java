package chapter10;

public class Drivermain {

	public static void main(String[] args) {
		Driver obj = new Driver();
		/* Vehicle bus=new Bus();
		 * obj.driver(bus); �� �� �ٷ� ���̸� �Ʒ�ó�� �ȴ�.
		 */
		obj.drive(new Bus());
		obj.drive(new Taxi());
	}

}
