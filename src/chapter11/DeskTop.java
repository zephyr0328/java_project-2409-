package chapter11;
//����� �ޱ� ���ؼ��� body�� �����ؾ��� -> �ݵ�� �������̵� �ؾ���
public class DeskTop extends Computer{
	
	@Override
	public void display() {
	System.out.println("DestTop");
	}

	@Override
	public void typing() {
	System.out.println("DeskTop");
	}

}
