package chapter05;

public class FucTest04 {
	
	//��ȯ���� ����.(void)
	public void channelDown(int volume) {
		System.out.println("�Ҹ��� "+volume+"��ŭ �����ϴ�.");
	}
	
	//��ȯ���� ����.
	public int channelUp(int volume) {
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
		return volume+2;
	}
	public static void main(String[] args) {
		FucTest04 tv = new FucTest04();

		System.out.println("�Ҹ��� " + tv.channelUp(5) + "��ŭ �ø��ϴ�.");
		System.out.println("============================");
		int volume = tv.channelUp(9);
		System.out.println("�Ҹ��� " + volume + "��ŭ �ø��ϴ�.");

		System.out.println();
		tv.channelDown(5);

	}

}
