package chapter06;

public class Subway {

	public String lineNumber;
	public int passengerCount;
	public int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void showInfo() {
		System.out.println("����ö" + lineNumber + "�� �°���" + passengerCount + "���̰�, ������" + money + "���Դϴ�.");

	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

}
