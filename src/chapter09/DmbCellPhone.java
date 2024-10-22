package chapter09;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.channel = channel;
		this.model = model;
		this.color = color;
	}

	public void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}

	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
