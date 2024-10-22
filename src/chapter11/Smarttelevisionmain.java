package chapter11;

public class Smarttelevisionmain {

	public static void main(String[] args) {

		SmartTElevision tv = new SmartTElevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-------------------------------");
		
		Remote rc=tv;
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();

	}

}
