package chapter06;

public class Bus {
	public int money;
	public String busNumber;
	public int passengerCount;
	
	public Bus(String busNumber) {
		this.busNumber=busNumber;
	}
	public void showInfo() {
		System.out.println("����" + busNumber + "�� �°���" + passengerCount + "���̰�, ������" + money + "���Դϴ�.");
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
}

