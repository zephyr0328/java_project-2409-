package chapter11;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub

	}
	//���� �̸��� ����Ʈ �޼��尡 �����ϸ� �ݵ�� �������̵��Ͽ��� �Ѵ�.
	@Override
	public void order() {
		Sell.super.order();
	}

}
