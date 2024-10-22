package chapter09;

public class Customer {

	// protected : ���� ��Ű���� ����� ������ Ŭ�������� ��밡��
	protected int customerID;
	protected String customerName;
	protected String customergrade;
	public double bonusPoint;
	protected double bonusRatio;

	public Customer() {
		customergrade = "SILVER";
		bonusRatio = 0.1;
	}

	// �����ε��� ������
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customergrade = "SILVER";
		bonusRatio = 0.01;
	}

	// ����Ʈ�� ����(��޿� ���� �ٸ�)
	public int calePrice(int Price) {
		bonusPoint += Price * bonusRatio;
		return Price;
	}

	public String showCustomer() {
		return customerName + "���� ����� " + customergrade + "�̸� ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}
	
	//���� ����
	public int getAgentID() {
		return -1;
	}
}
