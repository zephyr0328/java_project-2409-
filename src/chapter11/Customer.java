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
	//같은 이름의 디폴트 메서드가 존재하면 반드시 오버라이딩하여야 한다.
	@Override
	public void order() {
		Sell.super.order();
	}

}
