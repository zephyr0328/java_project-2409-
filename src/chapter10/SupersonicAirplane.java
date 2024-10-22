package chapter10;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMODE = NORMAL;

	@Override
	public void fly() {
		if (flyMODE == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		} else {
			super.fly();
		}

	}

}
