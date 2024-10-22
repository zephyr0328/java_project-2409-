package chapter06;

public class Customer {
	String customerName;
	int money;
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	public void visitCafe(Cafe cafe, int amount) {
		cafe.sell(amount);
		this.money -= amount;
	}
	//ÀÜ¾×
    public void showInfo() {
		System.out.println(customerName+"´ÔÀÇ ÀÜ¾×Àº : "+ money +"¿ø ÀÔ´Ï´Ù.");
    }
    
}
