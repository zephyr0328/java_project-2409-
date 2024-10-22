package chapter06;

public class Bus {
	public int money;
	public String busNumber;
	public int passengerCount;
	
	public Bus(String busNumber) {
		this.busNumber=busNumber;
	}
	public void showInfo() {
		System.out.println("버스" + busNumber + "의 승객은" + passengerCount + "명이고, 수입은" + money + "원입니다.");
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
}

