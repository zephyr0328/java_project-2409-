package chapter09;

public class VIPcustomer extends Customer {

	private int agentID;
	double saleRatio;

	// 생성자를 이용해서 customerID,customerName,agentID
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customergrade = "VIP";
		bonusRatio = 0.15;
		this.saleRatio = 0.1;
	}

	// 5000-(5000*0.15)
	@Override
	public int calePrice(int Price) {
		bonusPoint += Price - (int) (Price * saleRatio) * bonusRatio;
		return (Price - (int) (Price * saleRatio));
	}

	@Override
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomer() {
		return super.showCustomer() + "\n전문상담원은" + agentID + "입니다.";

	}

}
