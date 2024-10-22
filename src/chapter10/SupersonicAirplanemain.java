package chapter10;

public class SupersonicAirplanemain {

	public static void main(String[] args) {
		SupersonicAirplane supersonic = new SupersonicAirplane();

		supersonic.takeoff();
		supersonic.fly();
		supersonic.flyMODE = SupersonicAirplane.SUPERSONIC;
		supersonic.fly();
		supersonic.flyMODE = SupersonicAirplane.NORMAL;
		supersonic.fly();
		supersonic.land();

	}

}
